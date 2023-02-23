package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0964i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9276k;
/* compiled from: BottomSheetDialog.java */
/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes2.dex */
public class DialogC4547a extends DialogC0964i {
    private BottomSheetBehavior<FrameLayout> behavior;
    private BottomSheetBehavior.AbstractC4543f bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4548a implements View.OnClickListener {
        View$OnClickListenerC4548a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC4547a dialogC4547a = DialogC4547a.this;
            if (dialogC4547a.cancelable && dialogC4547a.isShowing() && DialogC4547a.this.shouldWindowCloseOnTouchOutside()) {
                DialogC4547a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$b */
    /* loaded from: classes2.dex */
    public class C4549b extends C7676a {
        C4549b() {
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            if (DialogC4547a.this.cancelable) {
                c7716c.m17694a(1048576);
                c7716c.m17683f0(true);
                return;
            }
            c7716c.m17683f0(false);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: j */
        public boolean mo17858j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                DialogC4547a dialogC4547a = DialogC4547a.this;
                if (dialogC4547a.cancelable) {
                    dialogC4547a.cancel();
                    return true;
                }
            }
            return super.mo17858j(view, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$c */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC4550c implements View.OnTouchListener {
        View$OnTouchListenerC4550c(DialogC4547a dialogC4547a) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$d */
    /* loaded from: classes2.dex */
    class C4551d extends BottomSheetBehavior.AbstractC4543f {
        C4551d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4543f
        /* renamed from: a */
        public void mo27418a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4543f
        /* renamed from: b */
        public void mo27417b(View view, int i) {
            if (i == 5) {
                DialogC4547a.this.cancel();
            }
        }
    }

    public DialogC4547a(Context context) {
        this(context, 0);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C9273h.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            BottomSheetBehavior<FrameLayout> m27460W = BottomSheetBehavior.m27460W((FrameLayout) frameLayout.findViewById(C9271f.design_bottom_sheet));
            this.behavior = m27460W;
            m27460W.m27470M(this.bottomSheetCallback);
            this.behavior.m27444l0(this.cancelable);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(C9233b.bottomSheetDialogTheme, typedValue, true)) {
                return typedValue.resourceId;
            }
            return C9276k.Theme_Design_Light_BottomSheetDialog;
        }
        return i;
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(C9271f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.container.findViewById(C9271f.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C9271f.touch_outside).setOnClickListener(new View$OnClickListenerC4548a());
        C7759x.m17498p0(frameLayout, new C4549b());
        frameLayout.setOnTouchListener(new View$OnTouchListenerC4550c(this));
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (this.dismissWithAnimation && behavior.m27458Y() != 5) {
            behavior.m27437q0(5);
        } else {
            super.cancel();
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0964i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.m27458Y() != 5) {
            return;
        }
        this.behavior.m27437q0(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeDefaultCallback() {
        this.behavior.m27454c0(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m27444l0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.DialogC0964i, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    public DialogC4547a(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C4551d();
        supportRequestWindowFeature(1);
    }

    @Override // androidx.appcompat.app.DialogC0964i, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.DialogC0964i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    protected DialogC4547a(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C4551d();
        supportRequestWindowFeature(1);
        this.cancelable = z;
    }
}
