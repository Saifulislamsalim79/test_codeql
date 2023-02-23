package p272h.p286c.p287a.p323c.p336t;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: InsetDialogOnTouchListener.java */
/* renamed from: h.c.a.c.t.a */
/* loaded from: classes2.dex */
public class View$OnTouchListenerC9311a implements View.OnTouchListener {

    /* renamed from: c */
    private final Dialog f21886c;

    /* renamed from: d */
    private final int f21887d;

    /* renamed from: e */
    private final int f21888e;

    /* renamed from: f */
    private final int f21889f;

    public View$OnTouchListenerC9311a(Dialog dialog, Rect rect) {
        this.f21886c = dialog;
        this.f21887d = rect.left;
        this.f21888e = rect.top;
        this.f21889f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f21887d + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f21888e + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f21889f;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f21886c.onTouchEvent(obtain);
    }
}
