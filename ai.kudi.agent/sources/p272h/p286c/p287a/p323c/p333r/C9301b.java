package p272h.p286c.p287a.p323c.p333r;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p272h.p286c.p287a.p323c.p333r.InterfaceC9303d;
/* compiled from: CircularRevealFrameLayout.java */
/* renamed from: h.c.a.c.r.b */
/* loaded from: classes2.dex */
public class C9301b extends FrameLayout implements InterfaceC9303d {

    /* renamed from: c */
    private final C9302c f21876c;

    @Override // p272h.p286c.p287a.p323c.p333r.InterfaceC9303d
    /* renamed from: a */
    public void mo15086a() {
        this.f21876c.m15102a();
        throw null;
    }

    @Override // p272h.p286c.p287a.p323c.p333r.InterfaceC9303d
    /* renamed from: b */
    public void mo15085b() {
        this.f21876c.m15101b();
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C9302c c9302c = this.f21876c;
        if (c9302c == null) {
            super.draw(canvas);
        } else {
            c9302c.m15100c(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f21876c.m15099d();
        throw null;
    }

    @Override // p272h.p286c.p287a.p323c.p333r.InterfaceC9303d
    public int getCircularRevealScrimColor() {
        this.f21876c.m15098e();
        throw null;
    }

    @Override // p272h.p286c.p287a.p323c.p333r.InterfaceC9303d
    public InterfaceC9303d.C9308e getRevealInfo() {
        this.f21876c.m15097f();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C9302c c9302c = this.f21876c;
        if (c9302c == null) {
            return super.isOpaque();
        }
        c9302c.m15096g();
        throw null;
    }

    @Override // p272h.p286c.p287a.p323c.p333r.InterfaceC9303d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f21876c.m15095h(drawable);
        throw null;
    }

    @Override // p272h.p286c.p287a.p323c.p333r.InterfaceC9303d
    public void setCircularRevealScrimColor(int i) {
        this.f21876c.m15094i(i);
        throw null;
    }

    @Override // p272h.p286c.p287a.p323c.p333r.InterfaceC9303d
    public void setRevealInfo(InterfaceC9303d.C9308e c9308e) {
        this.f21876c.m15093j(c9308e);
        throw null;
    }
}
