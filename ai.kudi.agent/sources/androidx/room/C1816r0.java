package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p201g.p262t.p263a.InterfaceC8099i;
import p201g.p262t.p263a.InterfaceC8100j;
/* compiled from: RoomSQLiteQuery.java */
/* renamed from: androidx.room.r0 */
/* loaded from: classes2.dex */
public class C1816r0 implements InterfaceC8100j, InterfaceC8099i {

    /* renamed from: A */
    static final TreeMap<Integer, C1816r0> f5523A = new TreeMap<>();

    /* renamed from: c */
    private volatile String f5524c;

    /* renamed from: d */
    final long[] f5525d;

    /* renamed from: e */
    final double[] f5526e;

    /* renamed from: f */
    final String[] f5527f;

    /* renamed from: w */
    final byte[][] f5528w;

    /* renamed from: x */
    private final int[] f5529x;

    /* renamed from: y */
    final int f5530y;

    /* renamed from: z */
    int f5531z;

    private C1816r0(int i) {
        this.f5530y = i;
        int i2 = i + 1;
        this.f5529x = new int[i2];
        this.f5525d = new long[i2];
        this.f5526e = new double[i2];
        this.f5527f = new String[i2];
        this.f5528w = new byte[i2];
    }

    /* renamed from: I */
    private static void m34468I() {
        if (f5523A.size() <= 15) {
            return;
        }
        int size = f5523A.size() - 10;
        Iterator<Integer> it = f5523A.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    /* renamed from: m */
    public static C1816r0 m34466m(String str, int i) {
        synchronized (f5523A) {
            Map.Entry<Integer, C1816r0> ceilingEntry = f5523A.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f5523A.remove(ceilingEntry.getKey());
                C1816r0 value = ceilingEntry.getValue();
                value.m34469F(str, i);
                return value;
            }
            C1816r0 c1816r0 = new C1816r0(i);
            c1816r0.m34469F(str, i);
            return c1816r0;
        }
    }

    /* renamed from: F */
    void m34469F(String str, int i) {
        this.f5524c = str;
        this.f5531z = i;
    }

    /* renamed from: J */
    public void m34467J() {
        synchronized (f5523A) {
            f5523A.put(Integer.valueOf(this.f5530y), this);
            m34468I();
        }
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindBlob(int i, byte[] bArr) {
        this.f5529x[i] = 5;
        this.f5528w[i] = bArr;
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindDouble(int i, double d) {
        this.f5529x[i] = 3;
        this.f5526e[i] = d;
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindLong(int i, long j) {
        this.f5529x[i] = 2;
        this.f5525d[i] = j;
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindNull(int i) {
        this.f5529x[i] = 1;
    }

    @Override // p201g.p262t.p263a.InterfaceC8099i
    public void bindString(int i, String str) {
        this.f5529x[i] = 4;
        this.f5527f[i] = str;
    }

    @Override // p201g.p262t.p263a.InterfaceC8100j
    /* renamed from: c */
    public String mo16756c() {
        return this.f5524c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p201g.p262t.p263a.InterfaceC8100j
    /* renamed from: g */
    public void mo16755g(InterfaceC8099i interfaceC8099i) {
        for (int i = 1; i <= this.f5531z; i++) {
            int i2 = this.f5529x[i];
            if (i2 == 1) {
                interfaceC8099i.bindNull(i);
            } else if (i2 == 2) {
                interfaceC8099i.bindLong(i, this.f5525d[i]);
            } else if (i2 == 3) {
                interfaceC8099i.bindDouble(i, this.f5526e[i]);
            } else if (i2 == 4) {
                interfaceC8099i.bindString(i, this.f5527f[i]);
            } else if (i2 == 5) {
                interfaceC8099i.bindBlob(i, this.f5528w[i]);
            }
        }
    }
}
