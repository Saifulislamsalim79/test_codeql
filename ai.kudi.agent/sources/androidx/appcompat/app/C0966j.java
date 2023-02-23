package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: AppCompatDialogFragment.java */
/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes2.dex */
public class C0966j extends androidx.fragment.app.h {
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC0964i(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC0964i) {
            DialogC0964i dialogC0964i = (DialogC0964i) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            dialogC0964i.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
