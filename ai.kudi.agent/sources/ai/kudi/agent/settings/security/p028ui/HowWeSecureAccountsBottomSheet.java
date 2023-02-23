package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.BottomSheetHowWeSecureAccountsBinding;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: HowWeSecureAccountsBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/security/ui/HowWeSecureAccountsBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.HowWeSecureAccountsBottomSheet */
/* loaded from: classes.dex */
public final class HowWeSecureAccountsBottomSheet extends DialogC4547a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HowWeSecureAccountsBottomSheet(Context context) {
        super(context, C0001R.style.FilterListDialog);
        Log_OC.getArray(context, "context");
        HowWeSecureAccountsBottomSheet r8 = this;
        LayoutInflater $r2 = r8.getLayoutInflater();
        BottomSheetHowWeSecureAccountsBinding $r3 = BottomSheetHowWeSecureAccountsBinding.inflate($r2, null, false);
        Log_OC.loadImage($r3, "inflate(layoutInflater, null, false)");
        LinearLayout $r4 = $r3.getRoot();
        setContentView($r4);
        ImageView $r5 = $r3.howWeSecureCloseButton;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.security.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HowWeSecureAccountsBottomSheet $r22 = HowWeSecureAccountsBottomSheet.this;
                HowWeSecureAccountsBottomSheet.m40870_init_$lambda0($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m40870_init_$lambda0(HowWeSecureAccountsBottomSheet howWeSecureAccountsBottomSheet, View view) {
        Log_OC.getArray(howWeSecureAccountsBottomSheet, "this$0");
        HowWeSecureAccountsBottomSheet r2 = howWeSecureAccountsBottomSheet;
        r2.dismiss();
    }
}
