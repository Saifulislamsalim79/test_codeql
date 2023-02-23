package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C5004x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
/* renamed from: com.google.android.play.core.assetpacks.l2 */
/* loaded from: classes2.dex */
final class C4892l2 {

    /* renamed from: h */
    private static final C4957a f12397h = new C4957a("SliceMetadataManager");

    /* renamed from: b */
    private final C4840b0 f12399b;

    /* renamed from: c */
    private final String f12400c;

    /* renamed from: d */
    private final int f12401d;

    /* renamed from: e */
    private final long f12402e;

    /* renamed from: f */
    private final String f12403f;

    /* renamed from: a */
    private final byte[] f12398a = new byte[8192];

    /* renamed from: g */
    private int f12404g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4892l2(C4840b0 c4840b0, String str, int i, long j, String str2) {
        this.f12399b = c4840b0;
        this.f12400c = str;
        this.f12401d = i;
        this.f12402e = j;
        this.f12403f = str2;
    }

    /* renamed from: n */
    private final File m26062n() {
        File m26136y = this.f12399b.m26136y(this.f12400c, this.f12401d, this.f12402e, this.f12403f);
        if (!m26136y.exists()) {
            m26136y.mkdirs();
        }
        return m26136y;
    }

    /* renamed from: o */
    private final File m26061o() throws IOException {
        File m26147n = this.f12399b.m26147n(this.f12400c, this.f12401d, this.f12402e, this.f12403f);
        m26147n.getParentFile().mkdirs();
        m26147n.createNewFile();
        return m26147n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4887k2 m26075a() throws IOException {
        File m26147n = this.f12399b.m26147n(this.f12400c, this.f12401d, this.f12402e, this.f12403f);
        if (m26147n.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(m26147n);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C4923t0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f12404g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C4887k2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C4923t0("Slice checkpoint file corrupt.", e);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    C5004x.m25877a(th, th2);
                }
                throw th;
            }
        }
        throw new C4923t0("Slice checkpoint file does not exist.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m26074b(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(m26067i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12404g));
        FileOutputStream fileOutputStream = new FileOutputStream(m26061o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5004x.m25877a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m26073c(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m26067i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C5004x.m25877a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m26072d(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(m26067i(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f12398a);
                if (read > 0) {
                    randomAccessFile.write(this.f12398a, 0, read);
                }
            } while (read == this.f12398a.length);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C5004x.m25877a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m26071e(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12404g));
        FileOutputStream fileOutputStream = new FileOutputStream(m26061o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5004x.m25877a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m26070f(byte[] bArr) throws IOException {
        this.f12404g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m26062n(), String.format("%s-LFH.dat", Integer.valueOf(this.f12404g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new C4923t0("Could not write metadata file.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m26069g(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12404g));
        FileOutputStream fileOutputStream = new FileOutputStream(m26061o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File m26142s = this.f12399b.m26142s(this.f12400c, this.f12401d, this.f12402e, this.f12403f);
            if (m26142s.exists()) {
                m26142s.delete();
            }
            fileOutputStream = new FileOutputStream(m26142s);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    C5004x.m25877a(th, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m26068h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f12404g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m26067i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f12398a);
            while (read > 0) {
                fileOutputStream.write(this.f12398a, 0, read);
                read = inputStream.read(this.f12398a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5004x.m25877a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final File m26067i() {
        return new File(m26062n(), String.format("%s-NAM.dat", Integer.valueOf(this.f12404g)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m26066j(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f12404g));
        FileOutputStream fileOutputStream = new FileOutputStream(m26061o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5004x.m25877a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m26065k(byte[] bArr, int i) throws IOException {
        this.f12404g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m26067i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5004x.m25877a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final int m26064l() throws IOException {
        File m26147n = this.f12399b.m26147n(this.f12400c, this.f12401d, this.f12402e, this.f12403f);
        if (m26147n.exists()) {
            FileInputStream fileInputStream = new FileInputStream(m26147n);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    return -1;
                }
                if (properties.getProperty("previousChunk") != null) {
                    return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                }
                throw new C4923t0("Slice checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    C5004x.m25877a(th, th2);
                }
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m26063m() {
        File m26147n = this.f12399b.m26147n(this.f12400c, this.f12401d, this.f12402e, this.f12403f);
        if (m26147n.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(m26147n);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f12397h.m25955e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e) {
                f12397h.m25955e("Could not read checkpoint while checking if extraction finished. %s", e);
                return false;
            }
        }
        return false;
    }
}
