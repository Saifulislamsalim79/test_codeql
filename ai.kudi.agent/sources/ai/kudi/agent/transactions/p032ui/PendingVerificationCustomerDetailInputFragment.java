package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentPendingVerificationBinding;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.settings.personal.p027ui.IdtypesFragment;
import ai.kudi.agent.transactions.data.Error;
import ai.kudi.agent.transactions.data.PendingVerificationCustomerDetailInputData;
import ai.kudi.agent.transactions.data.worker.VerificationSubComponent;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.viewmodels.PendingVerificationCustomerDetailInputPresenter;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PendingVerificationCustomerDetailInputFragment.kt */
@Metadata(m10422d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001:B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0096\u0001J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J$\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\t\u00100\u001a\u00020\u0005H\u0096\u0001J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\bH\u0002J\b\u00103\u001a\u00020#H\u0002J\b\u00104\u001a\u00020#H\u0002J\u0012\u00105\u001a\u00020#2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u00020#H\u0002J\b\u00109\u001a\u00020#H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PendingVerificationCustomerDetailInputFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/transactions/data/PendingVerificationCustomerDetailInputData;", "Lai/kudi/agent/transactions/viewmodels/PendingVerificationCustomerDetailInputPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentPendingVerificationBinding;", "()V", TransactionField.AMOUNT, "", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentPendingVerificationBinding;", "customerName", "customerPhoneNo", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "idType", "pendingVerificationActivity", "Lai/kudi/agent/transactions/ui/PendingVerificationActivity;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/viewmodels/PendingVerificationCustomerDetailInputPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/viewmodels/PendingVerificationCustomerDetailInputPresenter;)V", "transactionType", "createPresenter", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "setMaxLengthOfIdNo", "selectedCard", "setupUi", "showDatePicker", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/transactions/data/Error;", "showIdDetails", "showIdTypes", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationCustomerDetailInputFragment */
/* loaded from: classes.dex */
public final class PendingVerificationCustomerDetailInputFragment extends MvpFragment<PendingVerificationCustomerDetailInputData, PendingVerificationCustomerDetailInputPresenter> implements PendingVerificationCustomerDetailInputData, BaseViewBinder<FragmentPendingVerificationBinding> {
    public static final String ARGS_AMT = "args_amt";
    public static final String ARGS_CUSTOMER_NAME = "args_name";
    public static final String ARGS_CUSTOMER_PHONE_NUMBER = "args_phone_number";
    public static final String ARGS_TYPE = "args_type";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentPendingVerificationBinding> $$delegate_0;
    private String amount;
    private String customerName;
    private String customerPhoneNo;
    public Frame firebaseRemoteConfig;
    private String idType;
    private PendingVerificationActivity pendingVerificationActivity;
    public PendingVerificationCustomerDetailInputPresenter thisPresenter;
    private String transactionType;

    /* compiled from: PendingVerificationCustomerDetailInputFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PendingVerificationCustomerDetailInputFragment$Companion;", "", "()V", "ARGS_AMT", "", "ARGS_CUSTOMER_NAME", "ARGS_CUSTOMER_PHONE_NUMBER", "ARGS_TYPE", "newInstance", "Lai/kudi/agent/transactions/ui/PendingVerificationCustomerDetailInputFragment;", "name", "phoneNumber", TransactionField.AMOUNT, "type", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationCustomerDetailInputFragment$Companion */
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
        public final PendingVerificationCustomerDetailInputFragment newInstance(String str, String str2, String str3, String str4) {
            Bundle r7 = new Bundle();
            r7.putString(PendingVerificationCustomerDetailInputFragment.ARGS_CUSTOMER_NAME, str);
            r7.putString("args_phone_number", str2);
            r7.putString(PendingVerificationCustomerDetailInputFragment.ARGS_AMT, str3);
            r7.putString(PendingVerificationCustomerDetailInputFragment.ARGS_TYPE, str4);
            PendingVerificationCustomerDetailInputFragment r8 = new PendingVerificationCustomerDetailInputFragment();
            PendingVerificationCustomerDetailInputFragment r9 = r8;
            r9.setArguments(r7);
            return r8;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingVerificationCustomerDetailInputFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.amount = "";
        this.customerName = "";
        this.customerPhoneNo = "";
        this.transactionType = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMaxLengthOfIdNo(java.lang.String r12) {
        /*
            r11 = this;
            java.util.List r0 = ai.kudi.agent.transactions.utils.TransactionsUtilKt.getLocalIdTypes()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.transactions.utils.IdTypes r5 = (ai.kudi.agent.transactions.utils.IdTypes) r5
            r4 = r5
            java.lang.String r6 = r4.getLabel()
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r6, r12)
            if (r2 == 0) goto L8
            ai.kudi.agent.databinding.FragmentPendingVerificationBinding r7 = r11.requireBinding()
            ai.kudi.dip.library.edittext.KudiInputField r8 = r7.pendingKycIdNumber
            java.lang.String r9 = ""
            r8.setText(r9)
            ai.kudi.agent.databinding.FragmentPendingVerificationBinding r7 = r11.requireBinding()
            ai.kudi.dip.library.edittext.KudiInputField r8 = r7.pendingKycIdNumber
            int r10 = r4.getValidLength()
            r8.setMaxLength(r10)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.PendingVerificationCustomerDetailInputFragment.setMaxLengthOfIdNo(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupUi() {
        String $r1 = this.amount;
        final double $d0 = Double.parseDouble(StringExtKt.getRemoveAllLetters($r1));
        final FragmentPendingVerificationBinding $r2 = requireBinding();
        Frame $r3 = getFirebaseRemoteConfig();
        Item $r4 = $r3.m20914c();
        $r4.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.transactions.ui.AnnotationWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: a */
            public final void m38261a(Item item) {
                PendingVerificationCustomerDetailInputFragment $r22 = PendingVerificationCustomerDetailInputFragment.this;
                double $d02 = $d0;
                FragmentPendingVerificationBinding $r32 = $r2;
                PendingVerificationCustomerDetailInputFragment.m41230setupUi$lambda4$lambda1($r22, $d02, $r32, item);
            }
        });
        KudiInputField $r6 = $r2.pendingKycIdType;
        PendingVerificationCustomerDetailInputFragment$setupUi$1$2 r14 = new PendingVerificationCustomerDetailInputFragment$setupUi$1$2(this);
        $r6.setClickedListener(r14);
        KudiInputField $r62 = $r2.pendingKycDateOfBirth;
        PendingVerificationCustomerDetailInputFragment$setupUi$1$3 r15 = new PendingVerificationCustomerDetailInputFragment$setupUi$1$3(this);
        $r62.setClickedListener(r15);
        KudiInputField $r63 = $r2.etCustomerName;
        String $r12 = this.customerName;
        $r63.setText($r12);
        KudiInputField $r64 = $r2.etCustomerPhone;
        String $r13 = this.customerPhoneNo;
        $r64.setText($r13);
        KudiButton $r9 = $r2.btnContinue;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingVerificationCustomerDetailInputFragment $r22 = PendingVerificationCustomerDetailInputFragment.this;
                FragmentPendingVerificationBinding $r32 = $r2;
                double $d02 = $d0;
                PendingVerificationCustomerDetailInputFragment.m41231setupUi$lambda4$lambda2($r22, $r32, $d02, view);
            }
        });
        TextView $r11 = $r2.btnClose;
        Log_OC.loadImage($r11, "btnClose");
        ViewExtKt.addClickEffect$default($r11, 0, 0, 3, null);
        $r2.btnClose.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.DashboardFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingVerificationCustomerDetailInputFragment $r22 = PendingVerificationCustomerDetailInputFragment.this;
                PendingVerificationCustomerDetailInputFragment.m41232setupUi$lambda4$lambda3($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-4$lambda-1  reason: not valid java name */
    public static final void m41230setupUi$lambda4$lambda1(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment, double d, FragmentPendingVerificationBinding fragmentPendingVerificationBinding, Item item) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputFragment, "this$0");
        Log_OC.getArray(fragmentPendingVerificationBinding, "$this_apply");
        Log_OC.getArray(item, "it");
        if (item.m27801a()) {
            Frame $r3 = pendingVerificationCustomerDetailInputFragment.getFirebaseRemoteConfig();
            String $r4 = $r3.getSetting("max_transaction_amount_to_request_occupation");
            Log_OC.loadImage($r4, "firebaseRemoteConfig.getString(\"max_transaction_amount_to_request_occupation\")");
            Frame $r32 = pendingVerificationCustomerDetailInputFragment.getFirebaseRemoteConfig();
            String $r5 = $r32.getSetting("max_transaction_amount_to_request_id_details");
            Log_OC.loadImage($r5, "firebaseRemoteConfig.getString(\"max_transaction_amount_to_request_id_details\")");
            PendingVerificationCustomerDetailInputFragment r9 = pendingVerificationCustomerDetailInputFragment;
            View $r6 = r9.getView();
            if ($r6 == null) {
                return;
            }
            double $d1 = Double.parseDouble($r4);
            double $d2 = Double.parseDouble($r5);
            boolean $z0 = false;
            if (d <= $d2 && $d1 <= d) {
                $z0 = true;
            }
            if ($z0) {
                View $r7 = fragmentPendingVerificationBinding.customersOccupation;
                Log_OC.loadImage($r7, "customersOccupation");
                View $r62 = $r7;
                ViewExtKt.show($r62);
                View $r72 = fragmentPendingVerificationBinding.reasonForWidthrawal;
                Log_OC.loadImage($r72, "reasonForWidthrawal");
                View $r63 = $r72;
                ViewExtKt.show($r63);
                String $r42 = pendingVerificationCustomerDetailInputFragment.transactionType;
                PendingVerificationCustomerDetailInputFragment r92 = pendingVerificationCustomerDetailInputFragment;
                String $r8 = r92.getString(C0001R.string.wallet_top_up);
                if (Log_OC.append($r42, $r8)) {
                    pendingVerificationCustomerDetailInputFragment.showIdDetails();
                }
            }
            double $d12 = Double.parseDouble($r5);
            if (d > $d12) {
                View $r73 = fragmentPendingVerificationBinding.customersOccupation;
                Log_OC.loadImage($r73, "customersOccupation");
                View $r64 = $r73;
                ViewExtKt.show($r64);
                View $r74 = fragmentPendingVerificationBinding.reasonForWidthrawal;
                Log_OC.loadImage($r74, "reasonForWidthrawal");
                View $r65 = $r74;
                ViewExtKt.show($r65);
                pendingVerificationCustomerDetailInputFragment.showIdDetails();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-4$lambda-2  reason: not valid java name */
    public static final void m41231setupUi$lambda4$lambda2(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment, FragmentPendingVerificationBinding fragmentPendingVerificationBinding, double d, View view) {
        CharSequence $r5;
        CharSequence $r52;
        CharSequence $r53;
        CharSequence $r54;
        CharSequence $r55;
        CharSequence $r56;
        CharSequence $r57;
        Log_OC.getArray(pendingVerificationCustomerDetailInputFragment, "this$0");
        Log_OC.getArray(fragmentPendingVerificationBinding, "$this_apply");
        PendingVerificationCustomerDetailInputFragment r15 = pendingVerificationCustomerDetailInputFragment;
        ContextExtKt.hideKeyboard(r15);
        KudiInputField $r3 = fragmentPendingVerificationBinding.etCustomerPhone;
        String $r4 = $r3.getText();
        if ($r4 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r14;
        }
        $r5 = C13277t.m5414M0($r4);
        String $r42 = $r5.toString();
        KudiInputField $r32 = fragmentPendingVerificationBinding.etCustomerName;
        String $r6 = $r32.getText();
        if ($r6 == null) {
            NullPointerException r142 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r142;
        }
        $r52 = C13277t.m5414M0($r6);
        String $r62 = $r52.toString();
        KudiInputField $r33 = fragmentPendingVerificationBinding.reasonForWidthrawal;
        String $r7 = $r33.getText();
        if ($r7 == null) {
            NullPointerException r143 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r143;
        }
        $r53 = C13277t.m5414M0($r7);
        String $r72 = $r53.toString();
        KudiInputField $r34 = fragmentPendingVerificationBinding.customersOccupation;
        String $r8 = $r34.getText();
        if ($r8 == null) {
            NullPointerException r144 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r144;
        }
        $r54 = C13277t.m5414M0($r8);
        String $r82 = $r54.toString();
        KudiInputField $r35 = fragmentPendingVerificationBinding.pendingKycIdType;
        String $r9 = $r35.getText();
        if ($r9 == null) {
            NullPointerException r145 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r145;
        }
        $r55 = C13277t.m5414M0($r9);
        String $r92 = $r55.toString();
        KudiInputField $r36 = fragmentPendingVerificationBinding.pendingKycIdNumber;
        String $r10 = $r36.getText();
        if ($r10 == null) {
            NullPointerException r146 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r146;
        }
        $r56 = C13277t.m5414M0($r10);
        String $r102 = $r56.toString();
        KudiInputField $r37 = fragmentPendingVerificationBinding.pendingKycDateOfBirth;
        String $r11 = $r37.getText();
        if ($r11 == null) {
            NullPointerException r147 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r147;
        }
        $r57 = C13277t.m5414M0($r11);
        String $r112 = $r57.toString();
        PendingVerificationCustomerDetailInputPresenter $r12 = pendingVerificationCustomerDetailInputFragment.getThisPresenter();
        $r12.verifyCustomerDetail($r42, $r62, d, $r72, $r82, $r92, $r102, $r112);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUi$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41232setupUi$lambda4$lambda3(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment, View view) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputFragment, "this$0");
        PendingVerificationActivity $r2 = pendingVerificationCustomerDetailInputFragment.pendingVerificationActivity;
        if ($r2 != null) {
            Activity r4 = (Activity) $r2;
            r4.finish();
            return;
        }
        Log_OC.LogError("pendingVerificationActivity");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDatePicker() {
        PendingVerificationCustomerDetailInputFragment r7 = this;
        ContextExtKt.hideKeyboard(r7);
        DatePickerFragment.Companion $r1 = DatePickerFragment.Companion;
        DatePickerFragment $r2 = DatePickerFragment.Companion.newInstance$default($r1, true, null, false, 6, null);
        PendingVerificationCustomerDetailInputFragment r72 = this;
        FragmentManager $r3 = r72.getChildFragmentManager();
        PendingVerificationCustomerDetailInputFragment r73 = this;
        PreferenceActivity $r4 = r73.getViewLifecycleOwner();
        $r3.p1(DatePickerFragment.DATE_SET_KEY, $r4, new InterfaceC1523w() { // from class: ai.kudi.agent.transactions.ui.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38260c(String str, Bundle bundle) {
                PendingVerificationCustomerDetailInputFragment $r32 = PendingVerificationCustomerDetailInputFragment.this;
                PendingVerificationCustomerDetailInputFragment.m41233showDatePicker$lambda6($r32, str, bundle);
            }
        });
        PendingVerificationCustomerDetailInputFragment r74 = this;
        FragmentManager $r32 = r74.getChildFragmentManager();
        $r2.show($r32, DatePickerFragment.year);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showDatePicker$lambda-6  reason: not valid java name */
    public static final void m41233showDatePicker$lambda6(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment, String str, Bundle bundle) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r7;
            }
            Date $r4 = (Date) $r3;
            String $r1 = DateExtKt.formatDateForBvn($r4, "yyyy/MM/dd");
            FragmentPendingVerificationBinding $r5 = pendingVerificationCustomerDetailInputFragment.requireBinding();
            KudiInputField $r6 = $r5.pendingKycDateOfBirth;
            $r6.setText($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showIdDetails() {
        FragmentPendingVerificationBinding $r1 = requireBinding();
        View $r2 = $r1.pendingKycIdType;
        Log_OC.loadImage($r2, "pendingKycIdType");
        View r3 = $r2;
        ViewExtKt.show(r3);
        View $r22 = $r1.pendingKycIdNumber;
        Log_OC.loadImage($r22, "pendingKycIdNumber");
        View r32 = $r22;
        ViewExtKt.show(r32);
        View $r23 = $r1.pendingKycDateOfBirth;
        Log_OC.loadImage($r23, "pendingKycDateOfBirth");
        View r33 = $r23;
        ViewExtKt.show(r33);
        $r1.pendingKycDateOfBirth.disableEditablity();
        $r1.pendingKycIdType.disableEditablity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showIdTypes() {
        IdtypesFragment.Companion $r1 = IdtypesFragment.Companion;
        IdtypesFragment $r2 = $r1.newInstance();
        PendingVerificationCustomerDetailInputFragment$showIdTypes$1 r7 = new PendingVerificationCustomerDetailInputFragment$showIdTypes$1(this);
        $r2.setCallback(r7);
        PendingVerificationCustomerDetailInputFragment r9 = this;
        FragmentActivity $r4 = r9.getActivity();
        if ($r4 == null) {
            NullPointerException r8 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw r8;
        }
        AppCompatActivity $r5 = (AppCompatActivity) $r4;
        AppCompatActivityExtKt.startFragment$default($r5, $r2, C0001R.C0003id.pendingKycFrame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public PendingVerificationCustomerDetailInputPresenter createPresenter() {
        PendingVerificationCustomerDetailInputPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPendingVerificationBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentPendingVerificationBinding $r3 = (FragmentPendingVerificationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentPendingVerificationBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getFirebaseRemoteConfig() {
        Frame $r1 = this.firebaseRemoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("firebaseRemoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PendingVerificationCustomerDetailInputPresenter getThisPresenter() {
        PendingVerificationCustomerDetailInputPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentPendingVerificationBinding fragmentPendingVerificationBinding, Fragment fragment) {
        Log_OC.getArray(fragmentPendingVerificationBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentPendingVerificationBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentPendingVerificationBinding $r4 = (FragmentPendingVerificationBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        PendingVerificationCustomerDetailInputFragment r5 = this;
        super.onAttach(context);
        boolean $z0 = context instanceof PendingVerificationActivity;
        if ($z0) {
            this.pendingVerificationActivity = (PendingVerificationActivity) context;
        }
        PendingVerificationActivity $r3 = this.pendingVerificationActivity;
        if ($r3 != null) {
            VerificationSubComponent $r1 = $r3.getPendingSubComponent();
            $r1.inject(this);
            return;
        }
        Log_OC.LogError("pendingVerificationActivity");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PendingVerificationCustomerDetailInputFragment r5 = this;
        Bundle $r1 = r5.getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString(ARGS_CUSTOMER_NAME);
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "";
        }
        this.customerName = $r3;
        String $r22 = $r1.getString("args_phone_number");
        String $r32 = $r22;
        if ($r22 == null) {
            $r32 = "";
        }
        this.customerPhoneNo = $r32;
        String $r23 = $r1.getString(ARGS_AMT);
        String $r33 = $r23;
        if ($r23 == null) {
            $r33 = "0.0";
        }
        this.amount = $r33;
        String $r24 = $r1.getString(ARGS_TYPE);
        String $r4 = $r24 != null ? $r24 : "";
        this.transactionType = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPendingVerificationBinding $r4 = FragmentPendingVerificationBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        PendingVerificationCustomerDetailInputFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setupUi();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPendingVerificationBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentPendingVerificationBinding $r3 = (FragmentPendingVerificationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentPendingVerificationBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFirebaseRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.firebaseRemoteConfig = frame;
    }

    public final void setThisPresenter(PendingVerificationCustomerDetailInputPresenter pendingVerificationCustomerDetailInputPresenter) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputPresenter, "<set-?>");
        this.thisPresenter = pendingVerificationCustomerDetailInputPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.data.PendingVerificationCustomerDetailInputData
    public void showError(Error error) {
        if (error == null) {
            return;
        }
        FragmentPendingVerificationBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.etCustomerPhone;
        String $r4 = error.getPhoneError();
        $r3.setError($r4);
        KudiInputField $r32 = $r2.etCustomerName;
        String $r42 = error.getFullNameError();
        $r32.setError($r42);
        KudiInputField $r33 = $r2.pendingKycDateOfBirth;
        String $r43 = error.getDobError();
        $r33.setError($r43);
        KudiInputField $r34 = $r2.pendingKycIdNumber;
        String $r44 = error.getIdNumberError();
        $r34.setError($r44);
        KudiInputField $r35 = $r2.pendingKycIdType;
        String $r45 = error.getIdTypeError();
        $r35.setError($r45);
        KudiInputField $r36 = $r2.customersOccupation;
        String $r46 = error.getOccupationError();
        $r36.setError($r46);
        KudiInputField $r37 = $r2.reasonForWidthrawal;
        String $r47 = error.getReasonError();
        $r37.setError($r47);
    }
}
