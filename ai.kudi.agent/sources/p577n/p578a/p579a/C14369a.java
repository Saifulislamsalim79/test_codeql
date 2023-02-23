package p577n.p578a.p579a;
/* compiled from: BlockContent.java */
/* renamed from: n.a.a.a */
/* loaded from: classes3.dex */
class C14369a {

    /* renamed from: b */
    private int f31669b = 0;

    /* renamed from: a */
    private final StringBuilder f31668a = new StringBuilder();

    /* renamed from: a */
    public void m1939a(CharSequence charSequence) {
        if (this.f31669b != 0) {
            this.f31668a.append('\n');
        }
        this.f31668a.append(charSequence);
        this.f31669b++;
    }

    /* renamed from: b */
    public String m1938b() {
        return this.f31668a.toString();
    }
}
