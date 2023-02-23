package p425j.p434c.p435a.p436u.p438f;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import p425j.p434c.p435a.InterfaceC11176c;
import p425j.p434c.p435a.p436u.C11228c;
/* compiled from: LinkSpan.java */
/* renamed from: j.c.a.u.f.g */
/* loaded from: classes3.dex */
public class C11246g extends URLSpan {

    /* renamed from: c */
    private final C11228c f25380c;

    /* renamed from: d */
    private final String f25381d;

    /* renamed from: e */
    private final InterfaceC11176c f25382e;

    public C11246g(C11228c c11228c, String str, InterfaceC11176c interfaceC11176c) {
        super(str);
        this.f25380c = c11228c;
        this.f25381d = str;
        this.f25382e = interfaceC11176c;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f25382e.mo11449a(view, this.f25381d);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.f25380c.m11326f(textPaint);
    }
}
