package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ChargeBackQuestionAlert.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert;", "Landroidx/fragment/app/DialogFragment;", "()V", "listener", "Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert$ChargeBackQuestionAlertListener;", "getListener$feature_issue_resolution_release", "()Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert$ChargeBackQuestionAlertListener;", "setListener$feature_issue_resolution_release", "(Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert$ChargeBackQuestionAlertListener;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setupDialog", "", "dialog", "style", "", "ChargeBackQuestionAlertListener", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.ChargeBackQuestionAlert */
/* loaded from: classes.dex */
public final class ChargeBackQuestionAlert extends Chapter {
    public static final Companion Companion;
    public ChargeBackQuestionAlertListener listener;

    /* compiled from: ChargeBackQuestionAlert.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert$ChargeBackQuestionAlertListener;", "", "onNoClicked", "", "dialogFragment", "Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert;", "onYesClicked", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.ChargeBackQuestionAlert$ChargeBackQuestionAlertListener */
    /* loaded from: classes.dex */
    public interface ChargeBackQuestionAlertListener {
        void onNoClicked(ChargeBackQuestionAlert chargeBackQuestionAlert);

        void onYesClicked(ChargeBackQuestionAlert chargeBackQuestionAlert);
    }

    /* compiled from: ChargeBackQuestionAlert.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert;", "listener", "Lai/kudi/agent/issues/ui/ChargeBackQuestionAlert$ChargeBackQuestionAlertListener;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.ChargeBackQuestionAlert$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ChargeBackQuestionAlert newInstance(ChargeBackQuestionAlertListener chargeBackQuestionAlertListener) {
            Log_OC.getArray(chargeBackQuestionAlertListener, "listener");
            ChargeBackQuestionAlert $r2 = new ChargeBackQuestionAlert();
            $r2.setListener$feature_issue_resolution_release(chargeBackQuestionAlertListener);
            return $r2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreateDialog$lambda-3$lambda-2$lambda-0  reason: not valid java name */
    public static final void m39450onCreateDialog$lambda3$lambda2$lambda0(ChargeBackQuestionAlert chargeBackQuestionAlert, View view) {
        Log_OC.getArray(chargeBackQuestionAlert, "this$0");
        ChargeBackQuestionAlertListener $r1 = chargeBackQuestionAlert.getListener$feature_issue_resolution_release();
        $r1.onYesClicked(chargeBackQuestionAlert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreateDialog$lambda-3$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39451onCreateDialog$lambda3$lambda2$lambda1(ChargeBackQuestionAlert chargeBackQuestionAlert, View view) {
        Log_OC.getArray(chargeBackQuestionAlert, "this$0");
        ChargeBackQuestionAlertListener $r1 = chargeBackQuestionAlert.getListener$feature_issue_resolution_release();
        $r1.onNoClicked(chargeBackQuestionAlert);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ChargeBackQuestionAlertListener getListener$feature_issue_resolution_release() {
        ChargeBackQuestionAlertListener $r1 = this.listener;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("listener");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter
    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity $r3 = getActivity();
        DialogInterfaceC0936d $r4 = null;
        if ($r3 != null) {
            DialogInterfaceC0936d.C0937a r14 = new DialogInterfaceC0936d.C0937a($r3);
            LayoutInflater $r5 = requireActivity().getLayoutInflater();
            Log_OC.loadImage($r5, "requireActivity().layoutInflater");
            int $i0 = C0214R.C0217layout.layout_charge_back_question;
            View $r6 = $r5.inflate($i0, (ViewGroup) null);
            int $i02 = C0214R.C0216id.yes_it_was_button;
            View $r7 = $r6.findViewById($i02);
            ViewGroup $r8 = (KudiButton) $r7;
            ViewGroup r18 = $r8;
            r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.NewItemFragment$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChargeBackQuestionAlert $r2 = ChargeBackQuestionAlert.this;
                    ChargeBackQuestionAlert.m39450onCreateDialog$lambda3$lambda2$lambda0($r2, view);
                }
            });
            int $i03 = C0214R.C0216id.no_it_wasnt_button;
            View $r72 = $r6.findViewById($i03);
            TextView $r10 = (TextView) $r72;
            $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.NoteEditor$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChargeBackQuestionAlert $r2 = ChargeBackQuestionAlert.this;
                    ChargeBackQuestionAlert.m39451onCreateDialog$lambda3$lambda2$lambda1($r2, view);
                }
            });
            C13666w c13666w = C13666w.f30112a;
            r14.setView($r6);
            $r4 = r14.create();
        }
        if ($r4 != null) {
            DialogInterfaceC0936d r19 = $r4;
            return r19;
        }
        IllegalStateException r17 = new IllegalStateException("Activity cannot be null");
        throw r17;
    }

    public final void setListener$feature_issue_resolution_release(ChargeBackQuestionAlertListener chargeBackQuestionAlertListener) {
        Log_OC.getArray(chargeBackQuestionAlertListener, "<set-?>");
        this.listener = chargeBackQuestionAlertListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Chapter
    public void setupDialog(Dialog dialog, int i) {
        Log_OC.getArray(dialog, "dialog");
        Window $r1 = dialog.getWindow();
        if ($r1 == null) {
            return;
        }
        ColorDrawable $r3 = new ColorDrawable(0);
        $r1.setBackgroundDrawable($r3);
    }
}
