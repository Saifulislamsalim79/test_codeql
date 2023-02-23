package io.intercom.com.bumptech.glide.p412p.p413k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10850c;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ViewTarget.java */
/* renamed from: io.intercom.com.bumptech.glide.p.k.i */
/* loaded from: classes3.dex */
public abstract class AbstractC10870i<T extends View, Z> extends AbstractC10862a<Z> {

    /* renamed from: x */
    private static Integer f24821x;

    /* renamed from: c */
    protected final T f24822c;

    /* renamed from: d */
    private final C10871a f24823d;

    /* renamed from: e */
    private View.OnAttachStateChangeListener f24824e;

    /* renamed from: f */
    private boolean f24825f;

    /* renamed from: w */
    private boolean f24826w;

    /* compiled from: ViewTarget.java */
    /* renamed from: io.intercom.com.bumptech.glide.p.k.i$a */
    /* loaded from: classes3.dex */
    static final class C10871a {

        /* renamed from: e */
        static Integer f24827e;

        /* renamed from: a */
        private final View f24828a;

        /* renamed from: b */
        private final List<InterfaceC10868g> f24829b = new ArrayList();

        /* renamed from: c */
        private boolean f24830c;

        /* renamed from: d */
        private ViewTreeObserver$OnPreDrawListenerC10872a f24831d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ViewTarget.java */
        /* renamed from: io.intercom.com.bumptech.glide.p.k.i$a$a */
        /* loaded from: classes3.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC10872a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c */
            private final WeakReference<C10871a> f24832c;

            ViewTreeObserver$OnPreDrawListenerC10872a(C10871a c10871a) {
                this.f24832c = new WeakReference<>(c10871a);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C10871a c10871a = this.f24832c.get();
                if (c10871a != null) {
                    c10871a.m12064a();
                    return true;
                }
                return true;
            }
        }

        C10871a(View view) {
            this.f24828a = view;
        }

        /* renamed from: c */
        private static int m12062c(Context context) {
            if (f24827e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C10892h.m12014d(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f24827e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f24827e.intValue();
        }

        /* renamed from: e */
        private int m12060e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f24830c && this.f24828a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f24828a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m12062c(this.f24828a.getContext());
        }

        /* renamed from: f */
        private int m12059f() {
            int paddingTop = this.f24828a.getPaddingTop() + this.f24828a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f24828a.getLayoutParams();
            return m12060e(this.f24828a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m12058g() {
            int paddingLeft = this.f24828a.getPaddingLeft() + this.f24828a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f24828a.getLayoutParams();
            return m12060e(this.f24828a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m12057h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m12056i(int i, int i2) {
            return m12057h(i) && m12057h(i2);
        }

        /* renamed from: j */
        private void m12055j(int i, int i2) {
            Iterator it = new ArrayList(this.f24829b).iterator();
            while (it.hasNext()) {
                ((InterfaceC10868g) it.next()).mo12069d(i, i2);
            }
        }

        /* renamed from: a */
        void m12064a() {
            if (this.f24829b.isEmpty()) {
                return;
            }
            int m12058g = m12058g();
            int m12059f = m12059f();
            if (m12056i(m12058g, m12059f)) {
                m12055j(m12058g, m12059f);
                m12063b();
            }
        }

        /* renamed from: b */
        void m12063b() {
            ViewTreeObserver viewTreeObserver = this.f24828a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f24831d);
            }
            this.f24831d = null;
            this.f24829b.clear();
        }

        /* renamed from: d */
        void m12061d(InterfaceC10868g interfaceC10868g) {
            int m12058g = m12058g();
            int m12059f = m12059f();
            if (m12056i(m12058g, m12059f)) {
                interfaceC10868g.mo12069d(m12058g, m12059f);
                return;
            }
            if (!this.f24829b.contains(interfaceC10868g)) {
                this.f24829b.add(interfaceC10868g);
            }
            if (this.f24831d == null) {
                ViewTreeObserver viewTreeObserver = this.f24828a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC10872a viewTreeObserver$OnPreDrawListenerC10872a = new ViewTreeObserver$OnPreDrawListenerC10872a(this);
                this.f24831d = viewTreeObserver$OnPreDrawListenerC10872a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC10872a);
            }
        }

        /* renamed from: k */
        void m12054k(InterfaceC10868g interfaceC10868g) {
            this.f24829b.remove(interfaceC10868g);
        }
    }

    public AbstractC10870i(T t) {
        C10892h.m12014d(t);
        this.f24822c = t;
        this.f24823d = new C10871a(t);
    }

    /* renamed from: c */
    private Object m12068c() {
        Integer num = f24821x;
        if (num == null) {
            return this.f24822c.getTag();
        }
        return this.f24822c.getTag(num.intValue());
    }

    /* renamed from: d */
    private void m12067d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f24824e;
        if (onAttachStateChangeListener == null || this.f24826w) {
            return;
        }
        this.f24822c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f24826w = true;
    }

    /* renamed from: e */
    private void m12066e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f24824e;
        if (onAttachStateChangeListener == null || !this.f24826w) {
            return;
        }
        this.f24822c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f24826w = false;
    }

    /* renamed from: f */
    private void m12065f(Object obj) {
        Integer num = f24821x;
        if (num == null) {
            this.f24822c.setTag(obj);
        } else {
            this.f24822c.setTag(num.intValue(), obj);
        }
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public InterfaceC10850c getRequest() {
        Object m12068c = m12068c();
        if (m12068c != null) {
            if (m12068c instanceof InterfaceC10850c) {
                return (InterfaceC10850c) m12068c;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void getSize(InterfaceC10868g interfaceC10868g) {
        this.f24823d.m12061d(interfaceC10868g);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f24823d.m12063b();
        if (this.f24825f) {
            return;
        }
        m12066e();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m12067d();
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void removeCallback(InterfaceC10868g interfaceC10868g) {
        this.f24823d.m12054k(interfaceC10868g);
    }

    @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
    public void setRequest(InterfaceC10850c interfaceC10850c) {
        m12065f(interfaceC10850c);
    }

    public String toString() {
        return "Target for: " + this.f24822c;
    }
}
