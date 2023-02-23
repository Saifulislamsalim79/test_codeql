package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.appcompat.view.menu.InterfaceC1019p;
import p201g.p202a.C7452a;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7758w;
/* compiled from: AppCompatSpinner.java */
/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes2.dex */
public class C1143t extends Spinner implements InterfaceC7758w {

    /* renamed from: A */
    private static final int[] f3490A = {16843505};

    /* renamed from: c */
    private final C1089e f3491c;

    /* renamed from: d */
    private final Context f3492d;

    /* renamed from: e */
    private AbstractView$OnTouchListenerC1086d0 f3493e;

    /* renamed from: f */
    private SpinnerAdapter f3494f;

    /* renamed from: w */
    private final boolean f3495w;

    /* renamed from: x */
    private InterfaceC1154g f3496x;

    /* renamed from: y */
    int f3497y;

    /* renamed from: z */
    final Rect f3498z;

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.t$a */
    /* loaded from: classes2.dex */
    class C1144a extends AbstractView$OnTouchListenerC1086d0 {

        /* renamed from: B */
        final /* synthetic */ C1148e f3499B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1144a(View view, C1148e c1148e) {
            super(view);
            this.f3499B = c1148e;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0
        /* renamed from: b */
        public InterfaceC1019p mo37006b() {
            return this.f3499B;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC1086d0
        /* renamed from: c */
        public boolean mo37005c() {
            if (C1143t.this.getInternalPopup().mo36997b()) {
                return true;
            }
            C1143t.this.m37007b();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.t$b */
    /* loaded from: classes2.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC1145b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC1145b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C1143t.this.getInternalPopup().mo36997b()) {
                C1143t.this.m37007b();
            }
            ViewTreeObserver viewTreeObserver = C1143t.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.t$c */
    /* loaded from: classes2.dex */
    class DialogInterface$OnClickListenerC1146c implements InterfaceC1154g, DialogInterface.OnClickListener {

        /* renamed from: c */
        DialogInterfaceC0936d f3502c;

        /* renamed from: d */
        private ListAdapter f3503d;

        /* renamed from: e */
        private CharSequence f3504e;

        DialogInterface$OnClickListenerC1146c() {
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: a */
        public void mo36998a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: b */
        public boolean mo36997b() {
            DialogInterfaceC0936d dialogInterfaceC0936d = this.f3502c;
            if (dialogInterfaceC0936d != null) {
                return dialogInterfaceC0936d.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: d */
        public int mo36996d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        public void dismiss() {
            DialogInterfaceC0936d dialogInterfaceC0936d = this.f3502c;
            if (dialogInterfaceC0936d != null) {
                dialogInterfaceC0936d.dismiss();
                this.f3502c = null;
            }
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: f */
        public void mo36995f(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: g */
        public CharSequence mo36994g() {
            return this.f3504e;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: i */
        public Drawable mo36993i() {
            return null;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: j */
        public void mo36992j(CharSequence charSequence) {
            this.f3504e = charSequence;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: k */
        public void mo36991k(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: l */
        public void mo36990l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: m */
        public void mo36989m(int i, int i2) {
            if (this.f3503d == null) {
                return;
            }
            DialogInterfaceC0936d.C0937a c0937a = new DialogInterfaceC0936d.C0937a(C1143t.this.getPopupContext());
            CharSequence charSequence = this.f3504e;
            if (charSequence != null) {
                c0937a.setTitle(charSequence);
            }
            DialogInterfaceC0936d create = c0937a.setSingleChoiceItems(this.f3503d, C1143t.this.getSelectedItemPosition(), this).create();
            this.f3502c = create;
            ListView m37785b = create.m37785b();
            if (Build.VERSION.SDK_INT >= 17) {
                m37785b.setTextDirection(i);
                m37785b.setTextAlignment(i2);
            }
            this.f3502c.show();
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: n */
        public int mo36988n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: o */
        public void mo36987o(ListAdapter listAdapter) {
            this.f3503d = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1143t.this.setSelection(i);
            if (C1143t.this.getOnItemClickListener() != null) {
                C1143t.this.performItemClick(null, i, this.f3503d.getItemId(i));
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.t$d */
    /* loaded from: classes2.dex */
    public static class C1147d implements ListAdapter, SpinnerAdapter {

        /* renamed from: c */
        private SpinnerAdapter f3506c;

        /* renamed from: d */
        private ListAdapter f3507d;

        public C1147d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f3506c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f3507d = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof InterfaceC1128n0) {
                    InterfaceC1128n0 interfaceC1128n0 = (InterfaceC1128n0) spinnerAdapter;
                    if (interfaceC1128n0.getDropDownViewTheme() == null) {
                        interfaceC1128n0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3507d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f3506c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f3506c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f3506c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f3506c;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f3506c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f3507d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3506c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3506c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.t$e */
    /* loaded from: classes2.dex */
    class C1148e extends C1090e0 implements InterfaceC1154g {

        /* renamed from: a0 */
        private CharSequence f3508a0;

        /* renamed from: b0 */
        ListAdapter f3509b0;

        /* renamed from: c0 */
        private final Rect f3510c0;

        /* renamed from: d0 */
        private int f3511d0;

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.t$e$a */
        /* loaded from: classes2.dex */
        class C1149a implements AdapterView.OnItemClickListener {
            C1149a(C1143t c1143t) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C1143t.this.setSelection(i);
                if (C1143t.this.getOnItemClickListener() != null) {
                    C1148e c1148e = C1148e.this;
                    C1143t.this.performItemClick(view, i, c1148e.f3509b0.getItemId(i));
                }
                C1148e.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.t$e$b */
        /* loaded from: classes2.dex */
        class ViewTreeObserver$OnGlobalLayoutListenerC1150b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC1150b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C1148e c1148e = C1148e.this;
                if (!c1148e.m37001U(C1143t.this)) {
                    C1148e.this.dismiss();
                    return;
                }
                C1148e.this.m37003S();
                C1148e.super.mo37194c();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.t$e$c */
        /* loaded from: classes2.dex */
        class C1151c implements PopupWindow.OnDismissListener {

            /* renamed from: c */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f3515c;

            C1151c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f3515c = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C1143t.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f3515c);
                }
            }
        }

        public C1148e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f3510c0 = new Rect();
            m37210D(C1143t.this);
            m37204J(true);
            m37199O(0);
            m37202L(new C1149a(C1143t.this));
        }

        /* renamed from: S */
        void m37003S() {
            int m37002T;
            Drawable m37191i = m37191i();
            int i = 0;
            if (m37191i != null) {
                m37191i.getPadding(C1143t.this.f3498z);
                i = C1170x0.m36903b(C1143t.this) ? C1143t.this.f3498z.right : -C1143t.this.f3498z.left;
            } else {
                Rect rect = C1143t.this.f3498z;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C1143t.this.getPaddingLeft();
            int paddingRight = C1143t.this.getPaddingRight();
            int width = C1143t.this.getWidth();
            C1143t c1143t = C1143t.this;
            int i2 = c1143t.f3497y;
            if (i2 == -2) {
                int m37008a = c1143t.m37008a((SpinnerAdapter) this.f3509b0, m37191i());
                int i3 = C1143t.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C1143t.this.f3498z;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (m37008a > i4) {
                    m37008a = i4;
                }
                m37208F(Math.max(m37008a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m37208F((width - paddingLeft) - paddingRight);
            } else {
                m37208F(i2);
            }
            if (C1170x0.m36903b(C1143t.this)) {
                m37002T = i + (((width - paddingRight) - m37179z()) - m37002T());
            } else {
                m37002T = i + paddingLeft + m37002T();
            }
            m37192f(m37002T);
        }

        /* renamed from: T */
        public int m37002T() {
            return this.f3511d0;
        }

        /* renamed from: U */
        boolean m37001U(View view) {
            return C7759x.m17536T(view) && view.getGlobalVisibleRect(this.f3510c0);
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: g */
        public CharSequence mo36994g() {
            return this.f3508a0;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: j */
        public void mo36992j(CharSequence charSequence) {
            this.f3508a0 = charSequence;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: l */
        public void mo36990l(int i) {
            this.f3511d0 = i;
        }

        @Override // androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: m */
        public void mo36989m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean mo37195b = mo37195b();
            m37003S();
            m37205I(2);
            super.mo37194c();
            ListView mo37188p = mo37188p();
            mo37188p.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                mo37188p.setTextDirection(i);
                mo37188p.setTextAlignment(i2);
            }
            m37198P(C1143t.this.getSelectedItemPosition());
            if (mo37195b || (viewTreeObserver = C1143t.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserver$OnGlobalLayoutListenerC1150b viewTreeObserver$OnGlobalLayoutListenerC1150b = new ViewTreeObserver$OnGlobalLayoutListenerC1150b();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC1150b);
            m37203K(new C1151c(viewTreeObserver$OnGlobalLayoutListenerC1150b));
        }

        @Override // androidx.appcompat.widget.C1090e0, androidx.appcompat.widget.C1143t.InterfaceC1154g
        /* renamed from: o */
        public void mo36987o(ListAdapter listAdapter) {
            super.mo36987o(listAdapter);
            this.f3509b0 = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.t$f */
    /* loaded from: classes2.dex */
    public static class C1152f extends View.BaseSavedState {
        public static final Parcelable.Creator<C1152f> CREATOR = new C1153a();

        /* renamed from: c */
        boolean f3517c;

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: androidx.appcompat.widget.t$f$a */
        /* loaded from: classes2.dex */
        class C1153a implements Parcelable.Creator<C1152f> {
            C1153a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1152f createFromParcel(Parcel parcel) {
                return new C1152f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1152f[] newArray(int i) {
                return new C1152f[i];
            }
        }

        C1152f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f3517c ? (byte) 1 : (byte) 0);
        }

        C1152f(Parcel parcel) {
            super(parcel);
            this.f3517c = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatSpinner.java */
    /* renamed from: androidx.appcompat.widget.t$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC1154g {
        /* renamed from: a */
        void mo36998a(Drawable drawable);

        /* renamed from: b */
        boolean mo36997b();

        /* renamed from: d */
        int mo36996d();

        void dismiss();

        /* renamed from: f */
        void mo36995f(int i);

        /* renamed from: g */
        CharSequence mo36994g();

        /* renamed from: i */
        Drawable mo36993i();

        /* renamed from: j */
        void mo36992j(CharSequence charSequence);

        /* renamed from: k */
        void mo36991k(int i);

        /* renamed from: l */
        void mo36990l(int i);

        /* renamed from: m */
        void mo36989m(int i, int i2);

        /* renamed from: n */
        int mo36988n();

        /* renamed from: o */
        void mo36987o(ListAdapter listAdapter);
    }

    public C1143t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.spinnerStyle);
    }

    /* renamed from: a */
    int m37008a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f3498z);
            Rect rect = this.f3498z;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    void m37007b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f3496x.mo36989m(getTextDirection(), getTextAlignment());
        } else {
            this.f3496x.mo36989m(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1089e c1089e = this.f3491c;
        if (c1089e != null) {
            c1089e.m37223b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            return interfaceC1154g.mo36996d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            return interfaceC1154g.mo36988n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f3496x != null) {
            return this.f3497y;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final InterfaceC1154g getInternalPopup() {
        return this.f3496x;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            return interfaceC1154g.mo36993i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3492d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        return interfaceC1154g != null ? interfaceC1154g.mo36994g() : super.getPrompt();
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public ColorStateList getSupportBackgroundTintList() {
        C1089e c1089e = this.f3491c;
        if (c1089e != null) {
            return c1089e.m37222c();
        }
        return null;
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1089e c1089e = this.f3491c;
        if (c1089e != null) {
            return c1089e.m37221d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g == null || !interfaceC1154g.mo36997b()) {
            return;
        }
        this.f3496x.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3496x == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m37008a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1152f c1152f = (C1152f) parcelable;
        super.onRestoreInstanceState(c1152f.getSuperState());
        if (!c1152f.f3517c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC1145b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        C1152f c1152f = new C1152f(super.onSaveInstanceState());
        InterfaceC1154g interfaceC1154g = this.f3496x;
        c1152f.f3517c = interfaceC1154g != null && interfaceC1154g.mo36997b();
        return c1152f;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC1086d0 abstractView$OnTouchListenerC1086d0 = this.f3493e;
        if (abstractView$OnTouchListenerC1086d0 == null || !abstractView$OnTouchListenerC1086d0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            if (interfaceC1154g.mo36997b()) {
                return true;
            }
            m37007b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1089e c1089e = this.f3491c;
        if (c1089e != null) {
            c1089e.m37219f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1089e c1089e = this.f3491c;
        if (c1089e != null) {
            c1089e.m37218g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            interfaceC1154g.mo36990l(i);
            this.f3496x.mo36995f(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            interfaceC1154g.mo36991k(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f3496x != null) {
            this.f3497y = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            interfaceC1154g.mo36998a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C7462a.m18690d(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1154g interfaceC1154g = this.f3496x;
        if (interfaceC1154g != null) {
            interfaceC1154g.mo36992j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1089e c1089e = this.f3491c;
        if (c1089e != null) {
            c1089e.m37216i(colorStateList);
        }
    }

    @Override // p201g.p227h.p238l.InterfaceC7758w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1089e c1089e = this.f3491c;
        if (c1089e != null) {
            c1089e.m37215j(mode);
        }
    }

    public C1143t(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3495w) {
            this.f3494f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f3496x != null) {
            Context context = this.f3492d;
            if (context == null) {
                context = getContext();
            }
            this.f3496x.mo36987o(new C1147d(spinnerAdapter, context.getTheme()));
        }
    }

    public C1143t(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        r11.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r11 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1143t(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1143t.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
