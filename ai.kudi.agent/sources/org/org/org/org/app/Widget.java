package org.org.org.org.app;
/* loaded from: classes.dex */
public final class Widget implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f32281b;

    /* renamed from: c */
    public final /* synthetic */ C14581f f32282c;

    public Widget(C14581f c14581f, String str) {
        this.f32282c = c14581f;
        this.f32281b = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Runnable
    public final void run() {
        C14581f $r1 = this.f32282c;
        String $r2 = this.f32281b;
        C14581f.add($r1, $r2, null, 2, null);
    }
}
