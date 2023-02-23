package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0966j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: BottomSheetDialogFragment.java */
/* renamed from: com.google.android.material.bottomsheet.b */
/* loaded from: classes2.dex */
public class C4552b extends C0966j {
    private boolean waitingForDismissAllowingStateLoss;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BottomSheetDialogFragment.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b */
    /* loaded from: classes2.dex */
    public class C4554b extends BottomSheetBehavior.AbstractC4543f {
        private C4554b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4543f
        /* renamed from: a */
        public void mo27418a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4543f
        /* renamed from: b */
        public void mo27417b(View view, int i) {
            if (i == 5) {
                C4552b.this.dismissAfterAnimation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.m27458Y() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof DialogC4547a) {
            ((DialogC4547a) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.m27470M(new C4554b());
        bottomSheetBehavior.m27437q0(5);
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof DialogC4547a) {
            DialogC4547a dialogC4547a = (DialogC4547a) dialog;
            BottomSheetBehavior<FrameLayout> behavior = dialogC4547a.getBehavior();
            if (behavior.m27455b0() && dialogC4547a.getDismissWithAnimation()) {
                dismissWithAnimation(behavior, z);
                return true;
            }
            return false;
        }
        return false;
    }

    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.C0966j
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC4547a(getContext(), getTheme());
    }
}
