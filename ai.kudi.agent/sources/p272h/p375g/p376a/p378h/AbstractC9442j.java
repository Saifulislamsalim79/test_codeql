package p272h.p375g.p376a.p378h;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import p272h.p375g.p376a.C9429e;
import p272h.p375g.p376a.EnumC9428d;
import p272h.p375g.p376a.InterfaceC9426b;
/* compiled from: FieldParseInfo.java */
/* renamed from: h.g.a.h.j */
/* loaded from: classes2.dex */
public abstract class AbstractC9442j {

    /* renamed from: a */
    protected EnumC9428d f22106a;

    /* renamed from: b */
    protected int f22107b;

    /* renamed from: c */
    private String f22108c = System.getProperty("file.encoding");

    /* renamed from: d */
    protected boolean f22109d;

    /* renamed from: e */
    private InterfaceC9426b<?> f22110e;

    public AbstractC9442j(EnumC9428d enumC9428d, int i) {
        if (enumC9428d != null) {
            this.f22106a = enumC9428d;
            this.f22107b = i;
            return;
        }
        throw new IllegalArgumentException("IsoType cannot be null");
    }

    /* renamed from: d */
    public static AbstractC9442j m14714d(EnumC9428d enumC9428d, int i, String str) {
        AbstractC9442j c9448p;
        if (enumC9428d == EnumC9428d.ALPHA) {
            c9448p = new C9433b(i);
        } else if (enumC9428d == EnumC9428d.AMOUNT) {
            c9448p = new C9434c();
        } else if (enumC9428d == EnumC9428d.BINARY) {
            c9448p = new C9435d(i);
        } else if (enumC9428d == EnumC9428d.DATE10) {
            c9448p = new C9438f();
        } else if (enumC9428d == EnumC9428d.DATE4) {
            c9448p = new C9439g();
        } else if (enumC9428d == EnumC9428d.DATE_EXP) {
            c9448p = new C9440h();
        } else if (enumC9428d == EnumC9428d.LLBIN) {
            c9448p = new C9443k();
        } else if (enumC9428d == EnumC9428d.LLLBIN) {
            c9448p = new C9444l();
        } else if (enumC9428d == EnumC9428d.LLLVAR) {
            c9448p = new C9445m();
        } else if (enumC9428d == EnumC9428d.LLVAR) {
            c9448p = new C9446n();
        } else if (enumC9428d == EnumC9428d.NUMERIC) {
            c9448p = new C9447o(i);
        } else {
            c9448p = enumC9428d == EnumC9428d.TIME ? new C9448p() : null;
        }
        if (c9448p != null) {
            c9448p.m14713g(str);
            return c9448p;
        }
        throw new IllegalArgumentException(String.format("Cannot parse type %s", enumC9428d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m14717a(byte[] bArr, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        byte b;
        if (this.f22109d) {
            return Integer.parseInt(new String(bArr, i, i2, this.f22108c));
        }
        if (i2 == 3) {
            i3 = ((bArr[i] - 48) * 100) + ((bArr[i + 1] - 48) * 10);
            b = bArr[i + 2];
        } else {
            i3 = (bArr[i] - 48) * 10;
            b = bArr[i + 1];
        }
        return i3 + (b - 48);
    }

    /* renamed from: b */
    public String m14716b() {
        return this.f22108c;
    }

    /* renamed from: c */
    public InterfaceC9426b<?> m14715c() {
        return this.f22110e;
    }

    /* renamed from: e */
    public abstract <T> C9429e<?> mo14710e(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException;

    /* renamed from: f */
    public abstract <T> C9429e<?> mo14709f(int i, byte[] bArr, int i2, InterfaceC9426b<T> interfaceC9426b) throws ParseException, UnsupportedEncodingException;

    /* renamed from: g */
    public void m14713g(String str) {
        this.f22108c = str;
    }

    /* renamed from: h */
    public void m14712h(InterfaceC9426b<?> interfaceC9426b) {
        this.f22110e = interfaceC9426b;
    }

    /* renamed from: i */
    public void m14711i(boolean z) {
        this.f22109d = z;
    }
}
