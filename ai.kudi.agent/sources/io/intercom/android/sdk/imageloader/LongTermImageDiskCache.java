package io.intercom.android.sdk.imageloader;

import android.graphics.Bitmap;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.com.bumptech.glide.p392k.C10492a;
import io.intercom.com.bumptech.glide.p416r.C10889e;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes3.dex */
class LongTermImageDiskCache implements Closeable {
    private static final int APP_VERSION = 1;
    private static final int VALUE_COUNT = 1;
    private final File directory;
    private C10492a diskLruCache;
    private final int maxSize;
    private final DiskCacheWriteLocker writeLocker = new DiskCacheWriteLocker();
    private final Twig twig = LumberMill.getLogger();
    private final SafeKeyGenerator safeKeyGenerator = new SafeKeyGenerator();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class DiskCacheWriteLocker {
        private final Map<String, WriteLock> locks = new HashMap();
        private final WriteLockPool writeLockPool = new WriteLockPool();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public class WriteLock {
            int interestedThreads;
            final Lock lock = new ReentrantLock();

            WriteLock() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public class WriteLockPool {
            private static final int MAX_POOL_SIZE = 10;
            private final Queue<WriteLock> pool = new ArrayDeque();

            WriteLockPool() {
            }

            WriteLock obtain() {
                WriteLock poll;
                synchronized (this.pool) {
                    poll = this.pool.poll();
                }
                return poll == null ? new WriteLock() : poll;
            }

            void offer(WriteLock writeLock) {
                synchronized (this.pool) {
                    if (this.pool.size() < 10) {
                        this.pool.offer(writeLock);
                    }
                }
            }
        }

        DiskCacheWriteLocker() {
        }

        void acquire(String str) {
            WriteLock writeLock;
            synchronized (this) {
                writeLock = this.locks.get(str);
                if (writeLock == null) {
                    writeLock = this.writeLockPool.obtain();
                    this.locks.put(str, writeLock);
                }
                writeLock.interestedThreads++;
            }
            writeLock.lock.lock();
        }

        void release(String str) {
            WriteLock writeLock;
            synchronized (this) {
                writeLock = this.locks.get(str);
                if (writeLock != null && writeLock.interestedThreads > 0) {
                    int i = writeLock.interestedThreads - 1;
                    writeLock.interestedThreads = i;
                    if (i == 0) {
                        WriteLock remove = this.locks.remove(str);
                        if (remove.equals(writeLock)) {
                            this.writeLockPool.offer(remove);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + writeLock + ", but actually removed: " + remove + ", key: " + str);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot release a lock that is not held, key: ");
                sb.append(str);
                sb.append(", interestedThreads: ");
                sb.append(writeLock == null ? 0 : writeLock.interestedThreads);
                throw new IllegalArgumentException(sb.toString());
            }
            writeLock.lock.unlock();
        }
    }

    /* loaded from: classes3.dex */
    private static class SafeKeyGenerator {
        private final C10889e<String, String> loadIdToSafeHash = new C10889e<>(1000);

        SafeKeyGenerator() {
        }

        public String getSafeKey(String str) {
            String m12028g;
            synchronized (this.loadIdToSafeHash) {
                m12028g = this.loadIdToSafeHash.m12028g(str);
            }
            if (m12028g == null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(str.getBytes("UTF-8"));
                    m12028g = C10893i.m11993t(messageDigest.digest());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (NoSuchAlgorithmException e2) {
                    e2.printStackTrace();
                }
                synchronized (this.loadIdToSafeHash) {
                    this.loadIdToSafeHash.m12024k(str, m12028g);
                }
            }
            return m12028g;
        }
    }

    public LongTermImageDiskCache(File file, int i) {
        this.directory = file;
        this.maxSize = i;
    }

    private synchronized C10492a getDiskCache() throws IOException {
        if (this.diskLruCache == null) {
            this.diskLruCache = C10492a.m12947o0(this.directory, 1, 1, this.maxSize);
        }
        return this.diskLruCache;
    }

    private synchronized void resetDiskCache() {
        this.diskLruCache = null;
    }

    public synchronized void clear() {
        try {
            getDiskCache().m12956Z();
            resetDiskCache();
        } catch (IOException e) {
            this.twig.m13068e(e.getMessage(), new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C10492a c10492a = this.diskLruCache;
        if (c10492a != null) {
            c10492a.close();
        }
    }

    public void delete(String str) {
        try {
            getDiskCache().m12966A0(this.safeKeyGenerator.getSafeKey(str));
        } catch (IOException e) {
            this.twig.m13068e(e.getMessage(), new Object[0]);
        }
    }

    public File get(String str) {
        try {
            C10492a.C10497e m12950i0 = getDiskCache().m12950i0(this.safeKeyGenerator.getSafeKey(str));
            if (m12950i0 != null) {
                return m12950i0.m12921a(0);
            }
            return null;
        } catch (IOException e) {
            this.twig.m13068e(e.getMessage(), new Object[0]);
            return null;
        }
    }

    public boolean isClosed() {
        C10492a c10492a = this.diskLruCache;
        return c10492a == null || c10492a.isClosed();
    }

    public void put(String str, Bitmap bitmap) {
        C10492a diskCache;
        this.writeLocker.acquire(str);
        try {
            String safeKey = this.safeKeyGenerator.getSafeKey(str);
            try {
                diskCache = getDiskCache();
            } catch (IOException e) {
                this.twig.m13068e(e.getMessage(), new Object[0]);
            }
            if (diskCache.m12950i0(safeKey) != null) {
                return;
            }
            C10492a.C10495c m12953f0 = diskCache.m12953f0(safeKey);
            if (m12953f0 != null) {
                try {
                    write(m12953f0.m12936f(0), bitmap);
                    m12953f0.m12937e();
                    m12953f0.m12940b();
                    return;
                } catch (Throwable th) {
                    m12953f0.m12940b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
        } finally {
            this.writeLocker.release(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public void write(File file, Bitmap bitmap) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = 0;
        try {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (IOException unused) {
                    return;
                }
            } catch (FileNotFoundException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream2 = 100;
            bitmap.compress(bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (FileNotFoundException e2) {
            e = e2;
            bufferedOutputStream2 = bufferedOutputStream;
            this.twig.m13068e(e.getMessage(), new Object[0]);
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
                bufferedOutputStream2 = bufferedOutputStream2;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
