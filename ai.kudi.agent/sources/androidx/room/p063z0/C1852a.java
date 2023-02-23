package androidx.room.p063z0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: CopyLock.java */
/* renamed from: androidx.room.z0.a */
/* loaded from: classes2.dex */
public class C1852a {

    /* renamed from: e */
    private static final Map<String, Lock> f5622e = new HashMap();

    /* renamed from: a */
    private final File f5623a;

    /* renamed from: b */
    private final Lock f5624b;

    /* renamed from: c */
    private final boolean f5625c;

    /* renamed from: d */
    private FileChannel f5626d;

    public C1852a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f5623a = file2;
        this.f5624b = m34428a(file2.getAbsolutePath());
        this.f5625c = z;
    }

    /* renamed from: a */
    private static Lock m34428a(String str) {
        Lock lock;
        synchronized (f5622e) {
            lock = f5622e.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f5622e.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void m34427b() {
        this.f5624b.lock();
        if (this.f5625c) {
            try {
                FileChannel channel = new FileOutputStream(this.f5623a).getChannel();
                this.f5626d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: c */
    public void m34426c() {
        FileChannel fileChannel = this.f5626d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f5624b.unlock();
    }
}
