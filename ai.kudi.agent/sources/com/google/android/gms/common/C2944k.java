package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.k */
/* loaded from: classes2.dex */
public class C2944k extends androidx.fragment.app.h {

    /* renamed from: c */
    private Dialog f8113c;

    /* renamed from: d */
    private DialogInterface.OnCancelListener f8114d;

    /* renamed from: e */
    private Dialog f8115e;

    /* renamed from: e */
    public static C2944k m31586e(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C2944k c2944k = new C2944k();
        com.google.android.gms.common.internal.s.k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c2944k.f8113c = dialog2;
        if (onCancelListener != null) {
            c2944k.f8114d = onCancelListener;
        }
        return c2944k;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8114d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f8113c;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f8115e == null) {
                Context context = getContext();
                com.google.android.gms.common.internal.s.j(context);
                this.f8115e = new AlertDialog.Builder(context).create();
            }
            return this.f8115e;
        }
        return dialog;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
