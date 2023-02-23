package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* compiled from: MenuPopupWindow.java */
/* renamed from: androidx.appcompat.widget.g0 */
/* loaded from: classes2.dex */
public class C1100g0 extends C1090e0 implements InterfaceC1098f0 {

    /* renamed from: b0 */
    private static Method f3347b0;

    /* renamed from: a0 */
    private InterfaceC1098f0 f3348a0;

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.g0$a */
    /* loaded from: classes2.dex */
    public static class C1101a extends C1070b0 {

        /* renamed from: G */
        final int f3349G;

        /* renamed from: H */
        final int f3350H;

        /* renamed from: I */
        private InterfaceC1098f0 f3351I;

        /* renamed from: J */
        private MenuItem f3352J;

        public C1101a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.f3349G = 21;
                this.f3350H = 22;
                return;
            }
            this.f3349G = 22;
            this.f3350H = 21;
        }

        @Override // androidx.appcompat.widget.C1070b0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0998f c0998f;
            int pointToPosition;
            int i2;
            if (this.f3351I != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0998f = (C0998f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    c0998f = (C0998f) adapter;
                }
                C1003i c1003i = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0998f.getCount()) {
                    c1003i = c0998f.getItem(i2);
                }
                MenuItem menuItem = this.f3352J;
                if (menuItem != c1003i) {
                    C0999g m37558b = c0998f.m37558b();
                    if (menuItem != null) {
                        this.f3351I.mo37173h(m37558b, menuItem);
                    }
                    this.f3352J = c1003i;
                    if (c1003i != null) {
                        this.f3351I.mo37174e(m37558b, c1003i);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0998f c0998f;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f3349G) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.f3350H) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    c0998f = (C0998f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    c0998f = (C0998f) adapter;
                }
                c0998f.m37558b().m37528e(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        public void setHoverListener(InterfaceC1098f0 interfaceC1098f0) {
            this.f3351I = interfaceC1098f0;
        }

        @Override // androidx.appcompat.widget.C1070b0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3347b0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C1100g0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void m37178R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3327W.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void m37177S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3327W.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: T */
    public void m37176T(InterfaceC1098f0 interfaceC1098f0) {
        this.f3348a0 = interfaceC1098f0;
    }

    /* renamed from: U */
    public void m37175U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3347b0;
            if (method != null) {
                try {
                    method.invoke(this.f3327W, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.f3327W.setTouchModal(z);
    }

    @Override // androidx.appcompat.widget.InterfaceC1098f0
    /* renamed from: e */
    public void mo37174e(C0999g c0999g, MenuItem menuItem) {
        InterfaceC1098f0 interfaceC1098f0 = this.f3348a0;
        if (interfaceC1098f0 != null) {
            interfaceC1098f0.mo37174e(c0999g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1098f0
    /* renamed from: h */
    public void mo37173h(C0999g c0999g, MenuItem menuItem) {
        InterfaceC1098f0 interfaceC1098f0 = this.f3348a0;
        if (interfaceC1098f0 != null) {
            interfaceC1098f0.mo37173h(c0999g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C1090e0
    /* renamed from: s */
    C1070b0 mo37172s(Context context, boolean z) {
        C1101a c1101a = new C1101a(context, z);
        c1101a.setHoverListener(this);
        return c1101a;
    }
}
