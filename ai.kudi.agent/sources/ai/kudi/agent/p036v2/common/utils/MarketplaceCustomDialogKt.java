package ai.kudi.agent.p036v2.common.utils;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.databinding.LayoutMarketplaceProductDialogBinding;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.core.content.C1335a;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MarketplaceCustomDialog.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¨\u0006\r"}, m10421d2 = {"marketplaceCustomDialog", "", "context", "Landroid/content/Context;", "dialogButtonText", "", "dialogLabelText", "showCloseButton", "", "gifDrawable", "", "onDialogButtonClick", "Lkotlin/Function0;", "feature-collections_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.utils.MarketplaceCustomDialogKt */
/* loaded from: classes.dex */
public final class MarketplaceCustomDialogKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void marketplaceCustomDialog(Context context, String str, String str2, boolean z, int i, final InterfaceC11756a interfaceC11756a) {
        Window $r10;
        WindowManager.LayoutParams $r16;
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "dialogButtonText");
        Log_OC.getArray(str2, "dialogLabelText");
        Log_OC.getArray(interfaceC11756a, "onDialogButtonClick");
        LayoutInflater $r4 = LayoutInflater.from(context);
        Integer $r5 = null;
        LayoutMarketplaceProductDialogBinding $r6 = LayoutMarketplaceProductDialogBinding.inflate($r4, null, false);
        Log_OC.loadImage($r6, "inflate(LayoutInflater.from(context), null, false)");
        AlertDialog.Builder r23 = new AlertDialog.Builder(context);
        View $r8 = $r6.getRoot();
        View $r14 = $r8;
        AlertDialog.Builder $r7 = r23.setView($r14);
        final AlertDialog $r9 = $r7.setCancelable(false).show();
        Window $r102 = $r9.getWindow();
        if ($r102 != null) {
            int $i1 = R$drawable.dialog_bg;
            Drawable $r11 = C1335a.m36322f(context, $i1);
            $r102.setBackgroundDrawable($r11);
        }
        Rect r24 = new Rect();
        Activity $r13 = (Activity) context;
        View $r142 = $r13.getWindow().getDecorView();
        $r142.getWindowVisibleDisplayFrame(r24);
        if ($r9 != null && ($r10 = $r9.getWindow()) != null) {
            int $i12 = r24.width();
            double $d0 = $i12;
            Double.isNaN($d0);
            int $i13 = (int) ($d0 * 0.8d);
            Window $r15 = $r9.getWindow();
            if ($r15 != null && ($r16 = $r15.getAttributes()) != null) {
                int $i2 = ((ViewGroup.LayoutParams) $r16).height;
                $r5 = Integer.valueOf($i2);
            }
            int $i22 = $r5 == null ? r24.width() : $r5.intValue();
            $r10.setLayout($i13, $i22);
        }
        $r6.tvDialogBtn.setText(str);
        $r6.tvDialogLabelText.setText(str2);
        $r6.GIVDialog.setImageResource(i);
        if (z) {
            ImageView $r20 = $r6.IVCloseBtn;
            $r20.setVisibility(0);
        } else {
            ImageView $r202 = $r6.IVCloseBtn;
            $r202.setVisibility(8);
        }
        ImageView $r203 = $r6.IVCloseBtn;
        $r203.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.common.utils.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialog $r2 = $r9;
                $r2.dismiss();
            }
        });
        ViewGroup $r17 = $r6.tvDialogBtn;
        ViewGroup r27 = $r17;
        r27.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.common.utils.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialog $r2 = $r9;
                InterfaceC11756a $r3 = interfaceC11756a;
                MarketplaceCustomDialogKt.m41540marketplaceCustomDialog$lambda1($r2, $r3, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void marketplaceCustomDialog$default(Context context, String str, String str2, boolean $z0, int i, InterfaceC11756a interfaceC11756a, int i2, Object obj) {
        int $i2 = i2 & 8;
        if ($i2 != 0) {
            $z0 = false;
        }
        int $i1 = i2 & 32;
        if ($i1 != 0) {
            interfaceC11756a = MarketplaceCustomDialogKt$marketplaceCustomDialog$1.INSTANCE;
        }
        InterfaceC11756a r5 = interfaceC11756a;
        marketplaceCustomDialog(context, str, str2, $z0, i, r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: marketplaceCustomDialog$lambda-1  reason: not valid java name */
    public static final void m41540marketplaceCustomDialog$lambda1(AlertDialog alertDialog, InterfaceC11756a interfaceC11756a, View view) {
        Log_OC.getArray(interfaceC11756a, "$onDialogButtonClick");
        alertDialog.dismiss();
        interfaceC11756a.invoke();
    }
}
