package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.c */
/* loaded from: classes2.dex */
public class DialogFragmentC2828c extends DialogFragment {

    /* renamed from: c */
    private Dialog f7902c;

    /* renamed from: d */
    private DialogInterface.OnCancelListener f7903d;

    /* renamed from: e */
    private Dialog f7904e;

    /* renamed from: a */
    public static DialogFragmentC2828c m31870a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC2828c dialogFragmentC2828c = new DialogFragmentC2828c();
        com.google.android.gms.common.internal.s.k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC2828c.f7902c = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC2828c.f7903d = onCancelListener;
        }
        return dialogFragmentC2828c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7903d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7902c;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f7904e == null) {
                Activity activity = getActivity();
                com.google.android.gms.common.internal.s.j(activity);
                this.f7904e = new AlertDialog.Builder(activity).create();
            }
            return this.f7904e;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
