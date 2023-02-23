package p201g.p262t.p263a;
/* compiled from: SimpleSQLiteQuery.java */
/* renamed from: g.t.a.a */
/* loaded from: classes2.dex */
public final class C8087a implements InterfaceC8100j {

    /* renamed from: c */
    private final String f19448c;

    /* renamed from: d */
    private final Object[] f19449d;

    public C8087a(String str, Object[] objArr) {
        this.f19448c = str;
        this.f19449d = objArr;
    }

    /* renamed from: a */
    private static void m16779a(InterfaceC8099i interfaceC8099i, int i, Object obj) {
        if (obj == null) {
            interfaceC8099i.bindNull(i);
        } else if (obj instanceof byte[]) {
            interfaceC8099i.bindBlob(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            interfaceC8099i.bindDouble(i, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            interfaceC8099i.bindDouble(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            interfaceC8099i.bindLong(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            interfaceC8099i.bindLong(i, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            interfaceC8099i.bindLong(i, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            interfaceC8099i.bindLong(i, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            interfaceC8099i.bindString(i, (String) obj);
        } else if (obj instanceof Boolean) {
            interfaceC8099i.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    /* renamed from: b */
    public static void m16778b(InterfaceC8099i interfaceC8099i, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            m16779a(interfaceC8099i, i, obj);
        }
    }

    @Override // p201g.p262t.p263a.InterfaceC8100j
    /* renamed from: c */
    public String mo16756c() {
        return this.f19448c;
    }

    @Override // p201g.p262t.p263a.InterfaceC8100j
    /* renamed from: g */
    public void mo16755g(InterfaceC8099i interfaceC8099i) {
        m16778b(interfaceC8099i, this.f19449d);
    }

    public C8087a(String str) {
        this(str, null);
    }
}
