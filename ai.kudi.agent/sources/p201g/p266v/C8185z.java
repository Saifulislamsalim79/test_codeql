package p201g.p266v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOverlayApi14.java */
/* renamed from: g.v.z */
/* loaded from: classes2.dex */
public class C8185z implements InterfaceC8117b0 {

    /* renamed from: a */
    protected C8186a f19641a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOverlayApi14.java */
    /* renamed from: g.v.z$a */
    /* loaded from: classes2.dex */
    public static class C8186a extends ViewGroup {

        /* renamed from: c */
        ViewGroup f19642c;

        /* renamed from: d */
        View f19643d;

        /* renamed from: e */
        ArrayList<Drawable> f19644e;

        /* renamed from: f */
        C8185z f19645f;

        /* renamed from: w */
        private boolean f19646w;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C8186a(Context context, ViewGroup viewGroup, View view, C8185z c8185z) {
            super(context);
            this.f19644e = null;
            this.f19642c = viewGroup;
            this.f19643d = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f19645f = c8185z;
        }

        /* renamed from: c */
        private void m16558c() {
            if (this.f19646w) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m16557d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f19644e;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f19646w = true;
                    this.f19642c.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m16556e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f19642c.getLocationOnScreen(iArr2);
            this.f19643d.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void m16560a(Drawable drawable) {
            m16558c();
            if (this.f19644e == null) {
                this.f19644e = new ArrayList<>();
            }
            if (this.f19644e.contains(drawable)) {
                return;
            }
            this.f19644e.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        /* renamed from: b */
        public void m16559b(View view) {
            m16558c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f19642c && viewGroup.getParent() != null && C7759x.m17536T(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f19642c.getLocationOnScreen(iArr2);
                    C7759x.m17530Z(view, iArr[0] - iArr2[0]);
                    C7759x.m17528a0(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f19642c.getLocationOnScreen(iArr);
            this.f19643d.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f19643d.getWidth(), this.f19643d.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f19644e;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f19644e.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void m16555f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f19644e;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m16557d();
            }
        }

        /* renamed from: g */
        public void m16554g(View view) {
            super.removeView(view);
            m16557d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f19642c != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f19642c instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m16556e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f19644e) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8185z(Context context, ViewGroup viewGroup, View view) {
        this.f19641a = new C8186a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C8185z m16562e(View view) {
        ViewGroup m16561f = m16561f(view);
        if (m16561f != null) {
            int childCount = m16561f.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = m16561f.getChildAt(i);
                if (childAt instanceof C8186a) {
                    return ((C8186a) childAt).f19645f;
                }
            }
            return new C8179u(m16561f.getContext(), m16561f, view);
        }
        return null;
    }

    /* renamed from: f */
    static ViewGroup m16561f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p201g.p266v.InterfaceC8117b0
    /* renamed from: a */
    public void mo16564a(Drawable drawable) {
        this.f19641a.m16560a(drawable);
    }

    @Override // p201g.p266v.InterfaceC8117b0
    /* renamed from: b */
    public void mo16563b(Drawable drawable) {
        this.f19641a.m16555f(drawable);
    }
}
