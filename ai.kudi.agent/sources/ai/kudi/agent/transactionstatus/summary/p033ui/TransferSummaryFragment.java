package ai.kudi.agent.transactionstatus.summary.p033ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.FragmentExtensionKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentTransferSummaryBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.TransactionStatus;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactionstatus.summary.adapter.SummaryAdapter;
import ai.kudi.agent.transactionstatus.summary.model.SummaryModel;
import ai.kudi.agent.transactionstatus.summary.presenter.TransferSummaryPresenter;
import ai.kudi.agent.transactionstatus.summary.view.TransferSummaryView;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.transfer.p034ui.TransferToBankAmountFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankCustomersFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankFragment;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherAmountInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherRecipientInfoFragment;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.core.content.C1335a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransferSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 Q2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001QB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J \u0010$\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010(\u001a\u00020)H\u0002J \u0010*\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0016J\u0019\u0010/\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0096\u0001J$\u00103\u001a\u00020\"2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u000107H\u0016J\u0012\u00109\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0016J$\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J-\u0010D\u001a\u00020\"2\u0006\u0010E\u001a\u00020F2\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u0002070H2\u0006\u0010I\u001a\u00020JH\u0016¢\u0006\u0002\u0010KJ\b\u0010L\u001a\u00020\"H\u0016J\t\u0010M\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010N\u001a\u00020\"2\b\u0010O\u001a\u0004\u0018\u000107H\u0016J\b\u0010P\u001a\u00020\"H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000¨\u0006R"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/ui/TransferSummaryFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/transactionstatus/summary/view/TransferSummaryView;", "Lai/kudi/agent/transactionstatus/summary/presenter/TransferSummaryPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentTransferSummaryBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentTransferSummaryBinding;", "isCashOutFlow", "", "locationTracker", "Lai/kudi/agent/core/util/LocationUtil;", "getLocationTracker", "()Lai/kudi/agent/core/util/LocationUtil;", "setLocationTracker", "(Lai/kudi/agent/core/util/LocationUtil;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactionstatus/summary/presenter/TransferSummaryPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactionstatus/summary/presenter/TransferSummaryPresenter;)V", "transferType", "Landroid/os/Parcelable;", "createPresenter", "displayLocationAwareness", "", "displayLocationNotification", "getBankTransferSummary", "Ljava/util/ArrayList;", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "Lkotlin/collections/ArrayList;", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "getVoucherTransferSummary", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "handleTransfer", "hideLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToTransactionStatusPage", TransactionField.STATUS, "Lai/kudi/agent/transactions/TransactionStatus;", "transactionReference", "", "errorMessage", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "pinConfirmationDialog", "requireBinding", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment */
/* loaded from: classes.dex */
public final class TransferSummaryFragment extends AbstractC9412c<TransferSummaryView, TransferSummaryPresenter> implements TransferSummaryView, BaseViewBinder<FragmentTransferSummaryBinding> {
    public static final String ARG_IS_CASH_OUT_FLOW = "arg_is_cash_out_flow";
    public static final Companion Companion;
    public static final int KUDI_CHARGE = 50;
    public static final String TRANSFER_SUMMARY_ARGS = "TRANSFER_SUMMARY_ARGS";
    private final /* synthetic */ BaseViewBinderImpl<FragmentTransferSummaryBinding> $$delegate_0;
    private boolean isCashOutFlow;
    private LocationUtil locationTracker;
    public SharedPreferences sharedPreferences;
    public TransferSummaryPresenter thisPresenter;
    private Parcelable transferType;

    /* compiled from: TransferSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/ui/TransferSummaryFragment$Companion;", "", "()V", "ARG_IS_CASH_OUT_FLOW", "", "KUDI_CHARGE", "", TransferSummaryFragment.TRANSFER_SUMMARY_ARGS, "newInstance", "Lai/kudi/agent/transactionstatus/summary/ui/TransferSummaryFragment;", TransactionRequest.TYPE_REQUEST, "Landroid/os/Parcelable;", "isCashOutFlow", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$Companion */
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
        public static /* synthetic */ TransferSummaryFragment newInstance$default(Companion companion, Parcelable parcelable, boolean $z0, int i, Object obj) {
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            TransferSummaryFragment $r2 = companion.newInstance(parcelable, $z0);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransferSummaryFragment newInstance(Parcelable parcelable, boolean z) {
            TransferSummaryFragment r5 = new TransferSummaryFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(TransferSummaryFragment.TRANSFER_SUMMARY_ARGS, parcelable);
            r6.putBoolean(TransferSummaryFragment.ARG_IS_CASH_OUT_FLOW, z);
            C13666w c13666w = C13666w.f30112a;
            TransferSummaryFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
        }
    }

    /* compiled from: TransferSummaryFragment.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            TransactionStatus[] $r0 = TransactionStatus.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionStatus $r2 = TransactionStatus.SUCCESSFUL;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            TransactionStatus $r22 = TransactionStatus.FAILED;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            TransactionStatus $r23 = TransactionStatus.PENDING;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            $EnumSwitchMapping$0 = $r1;
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
    public TransferSummaryFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayLocationAwareness() {
        C0643xdd053d9 r6 = new C0643xdd053d9(this);
        TransferSummaryFragment$displayLocationAwareness$okCallback$1 r7 = new TransferSummaryFragment$displayLocationAwareness$okCallback$1(this);
        TransferSummaryFragment r8 = this;
        String $r3 = r8.getString(C0001R.string.location_notification);
        Log_OC.loadImage($r3, "getString(R.string.location_notification)");
        CustomDialog.Companion $r4 = CustomDialog.Companion;
        TransferSummaryFragment r82 = this;
        FragmentActivity $r5 = r82.requireActivity();
        Log_OC.loadImage($r5, "requireActivity()");
        $r4.show("BOLT Transaction", $r3, "Ok", "Cancel", r7, r6, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void displayLocationNotification() {
        TransferSummaryFragment r6 = this;
        if (r6.getActivity() == null) {
            return;
        }
        TransferSummaryFragment r62 = this;
        FragmentActivity $r1 = r62.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        LocationUtil r5 = new LocationUtil($r1);
        this.locationTracker = r5;
        Log_OC.append(r5);
        boolean $z0 = r5.isGpsOn();
        if ($z0) {
            InterfaceC9413d $r3 = this.presenter;
            TransferSummaryPresenter $r4 = (TransferSummaryPresenter) $r3;
            $r4.logUserEvent("TransferSummaryFragment: Location is enabled");
            return;
        }
        LocationUtil $r2 = this.locationTracker;
        if ($r2 == null) {
            return;
        }
        $r2.onGpsWithoutSetting();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ArrayList getBankTransferSummary(TransferToBankPayload transferToBankPayload) {
        ArrayList $r16;
        String $r4;
        SummaryModel[] $r2 = new SummaryModel[3];
        String $r42 = transferToBankPayload.getAccountName();
        String $r5 = String.valueOf($r42);
        Object[] $r6 = new Object[2];
        String $r7 = transferToBankPayload.getAccountNumber();
        String $r8 = $r7;
        String $r43 = "";
        if ($r7 == null) {
            $r8 = "";
        }
        $r6[0] = $r8;
        Bank.BanksList r20 = new Bank.BanksList();
        $r6[1] = r20.getBankName(transferToBankPayload.getBankCode());
        String $r72 = getString(C0001R.string.bank_details, $r6);
        Log_OC.loadImage($r72, "getString(\n                    R.string.bank_details,\n                    payload.accountNumber ?: \"\",\n                    Bank.BanksList().getBankName(payload.bankCode)\n                )");
        boolean $z1 = this.isCashOutFlow;
        TransferToBankFragment.Companion $r10 = TransferToBankFragment.Companion;
        Fragment $r11 = TransferToBankFragment.Companion.newInstance$default($r10, transferToBankPayload, true, false, 4, null);
        Fragment r23 = $r11;
        SummaryModel r21 = new SummaryModel($r5, $r72, !$z1, r23);
        $r2[0] = r21;
        StringBuilder r22 = new StringBuilder();
        TransferSummaryFragment r232 = this;
        String $r52 = r232.getString(C0001R.string.naira_symbol);
        r22.append($r52);
        r22.append(' ');
        Integer $r13 = transferToBankPayload.getAmount();
        String $r53 = String.valueOf($r13);
        r22.append(StringExtKt.getFormatToCurrency($r53));
        String $r54 = r22.toString();
        boolean $z12 = this.isCashOutFlow;
        TransferToBankAmountFragment.Companion $r14 = TransferToBankAmountFragment.Companion;
        Fragment $r15 = TransferToBankAmountFragment.Companion.newInstance$default($r14, transferToBankPayload, true, false, 4, null);
        Fragment r233 = $r15;
        SummaryModel r212 = new SummaryModel("Transfer Amount", $r54, !$z12, r233);
        $r2[1] = r212;
        StringBuilder r222 = new StringBuilder();
        TransferSummaryFragment r234 = this;
        String $r55 = r234.getString(C0001R.string.naira_symbol);
        r222.append($r55);
        r222.append(' ');
        String $r56 = transferToBankPayload.getServiceFee();
        r222.append((Object) $r56);
        String $r57 = r222.toString();
        SummaryModel r213 = new SummaryModel("Nomba Charge", $r57, false, null, 12, null);
        $r2[2] = r213;
        $r16 = C13726r.m3893c($r2);
        boolean $z13 = this.isCashOutFlow;
        if (!$z13) {
            SharedPreferences $r17 = getSharedPreferences();
            String $r58 = $r17.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "USER");
            boolean $z14 = Log_OC.append($r58, "USER");
            String $r59 = $z14 ? TransactionField.TRANSACTION_REASON : "Customer's Information";
            if ($z14) {
                String $r73 = transferToBankPayload.getReason();
                Log_OC.append($r73);
                int $i0 = $r73.length();
                if ($i0 > 0) {
                    String $r44 = transferToBankPayload.getReason();
                    $r43 = String.valueOf($r44);
                }
            } else {
                StringBuilder r223 = new StringBuilder();
                String $r45 = transferToBankPayload.getSendersPhone();
                r223.append((Object) $r45);
                r223.append(' ');
                String $r46 = transferToBankPayload.getReason();
                Log_OC.append($r46);
                int $i02 = $r46.length();
                if ($i02 > 0) {
                    String $r47 = transferToBankPayload.getReason();
                    $r4 = Log_OC.m10359a("| ", (Object) $r47);
                } else {
                    $r4 = " ";
                }
                r223.append($r4);
                $r43 = r223.toString();
            }
            boolean $z0 = this.isCashOutFlow;
            TransferToBankCustomersFragment.Companion $r18 = TransferToBankCustomersFragment.Companion;
            Fragment $r19 = $r18.newInstance(transferToBankPayload);
            Fragment r235 = $r19;
            SummaryModel r214 = new SummaryModel($r59, $r43, !$z0, r235);
            $r16.add(2, r214);
        }
        return $r16;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ArrayList getVoucherTransferSummary(VoucherCashInRequest voucherCashInRequest) {
        ArrayList $r15;
        SummaryModel[] $r2 = new SummaryModel[3];
        String $r4 = voucherCashInRequest.getRecipientPhoneNumber();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        CreateVoucherRecipientInfoFragment.Companion $r6 = CreateVoucherRecipientInfoFragment.Companion;
        CreateVoucherRecipientInfoFragment $r7 = $r6.newInstance(voucherCashInRequest, true);
        SummaryModel r16 = new SummaryModel("Receiver's Phone Number", $r5, true, $r7);
        $r2[0] = r16;
        C11780a0 c11780a0 = C11780a0.f26475a;
        String $r42 = getString(C0001R.string.total_amount_processed);
        Log_OC.loadImage($r42, "getString(R.string.total_amount_processed)");
        Locale $r10 = Locale.US;
        NumberFormat $r11 = NumberFormat.getNumberInstance($r10);
        int $i0 = voucherCashInRequest.getAmount();
        Integer $r12 = Integer.valueOf($i0);
        String $r52 = $r11.format($r12);
        Object[] $r9 = {$r52};
        String $r43 = String.format($r42, Arrays.copyOf($r9, 1));
        Log_OC.loadImage($r43, "java.lang.String.format(format, *args)");
        CreateVoucherAmountInfoFragment.Companion $r13 = CreateVoucherAmountInfoFragment.Companion;
        Fragment $r14 = $r13.newInstance(voucherCashInRequest, true);
        Fragment r17 = $r14;
        SummaryModel r162 = new SummaryModel("Transfer Amount", $r43, true, r17);
        $r2[1] = r162;
        C11780a0 $r8 = C11780a0.f26475a;
        TransferSummaryFragment r172 = this;
        String $r44 = r172.getString(C0001R.string.total_amount_processed);
        Log_OC.loadImage($r44, "getString(R.string.total_amount_processed)");
        Object[] $r92 = {50};
        String $r45 = String.format($r44, Arrays.copyOf($r92, 1));
        Log_OC.loadImage($r45, "java.lang.String.format(format, *args)");
        SummaryModel r163 = new SummaryModel("Nomba Charge", $r45, false, null, 8, null);
        $r2[2] = r163;
        $r15 = C13726r.m3893c($r2);
        return $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleTransfer() {
        Parcelable $r3 = this.transferType;
        if ($r3 == null) {
            Log_OC.LogError("transferType");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        TransferToBankPayload $r4 = (TransferToBankPayload) $r3;
        LocationUtil $r1 = this.locationTracker;
        if ($r1 == null) {
            return;
        }
        TransferSummaryFragment r9 = this;
        FragmentActivity $r5 = r9.requireActivity();
        C4107a $r6 = C4109b.m28503a($r5);
        Log_OC.loadImage($r6, "getFusedLocationProviderClient(requireActivity())");
        TransferSummaryFragment$handleTransfer$1 r8 = new TransferSummaryFragment$handleTransfer$1(this, $r4);
        LocationUtil.getLastLocation$default($r1, $r6, 0, r8, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final TransferSummaryFragment newInstance(Parcelable parcelable, boolean z) {
        Companion $r0 = Companion;
        TransferSummaryFragment $r1 = $r0.newInstance(parcelable, z);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-2$lambda-0 */
    public static final void m41304onActivityCreated$lambda2$lambda0(TransferSummaryFragment transferSummaryFragment, View view) {
        Log_OC.getArray(transferSummaryFragment, "this$0");
        TransferSummaryPresenter $r0 = transferSummaryFragment.getThisPresenter();
        $r0.showAuthDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: pinConfirmationDialog$lambda-5 */
    public static final void m41305pinConfirmationDialog$lambda5(TransferSummaryFragment transferSummaryFragment, String str, Bundle bundle) {
        String $r8;
        Log_OC.getArray(transferSummaryFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        Parcelable $r3 = transferSummaryFragment.transferType;
        if ($r3 == null) {
            Log_OC.LogError("transferType");
            NullPointerException $r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r9;
        }
        boolean $z0 = $r3 instanceof VoucherCashInRequest;
        if (!$z0) {
            boolean $z02 = $r3 instanceof TransferToBankPayload;
            if ($z02) {
                transferSummaryFragment.handleTransfer();
                return;
            }
            return;
        }
        TransferSummaryPresenter $r5 = transferSummaryFragment.getThisPresenter();
        TransferSummaryPresenter $r6 = transferSummaryFragment.getThisPresenter();
        User $r7 = $r6.getUser();
        String $r1 = "";
        if ($r7 != null && ($r8 = $r7.getPhoneNumber()) != null) {
            $r1 = $r8;
        }
        $r5.logEventUponPinVerification($r1, true, null);
        TransferSummaryFragment r11 = transferSummaryFragment;
        Bundle $r2 = r11.getArguments();
        VoucherCashInRequest $r4 = $r2 != null ? (VoucherCashInRequest) $r2.getParcelable(TRANSFER_SUMMARY_ARGS) : null;
        if ($r4 == null) {
            NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest");
            throw r10;
        }
        TransferSummaryPresenter $r52 = transferSummaryFragment.getThisPresenter();
        $r52.createVoucher($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: pinConfirmationDialog$lambda-6 */
    public static final void m41306pinConfirmationDialog$lambda6(TransferSummaryFragment transferSummaryFragment, String str, Bundle bundle) {
        String $r7;
        Log_OC.getArray(transferSummaryFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "bundle");
        String $r1 = bundle.getString(KudiPin.ERROR_MESSAGE_KEY);
        TransferSummaryPresenter $r3 = transferSummaryFragment.getThisPresenter();
        TransferSummaryPresenter $r4 = transferSummaryFragment.getThisPresenter();
        User $r5 = $r4.getUser();
        String $r6 = "";
        if ($r5 != null && ($r7 = $r5.getPhoneNumber()) != null) {
            $r6 = $r7;
        }
        $r3.logEventUponPinVerification($r6, false, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransferSummaryPresenter createPresenter() {
        TransferSummaryPresenter $r1 = getThisPresenter();
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
    public FragmentTransferSummaryBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentTransferSummaryBinding $r3 = (FragmentTransferSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentTransferSummaryBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LocationUtil getLocationTracker() {
        LocationUtil r1 = this.locationTracker;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransferSummaryPresenter getThisPresenter() {
        TransferSummaryPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.transactionstatus.summary.view.TransferSummaryView
    public void hideLoading() {
        FragmentTransferSummaryBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.progressBar;
        Log_OC.loadImage($r2, "progressBar");
        ViewExtKt.hide$default($r2, false, 1, null);
        View $r3 = $r1.createVoucherButton;
        Log_OC.loadImage($r3, "createVoucherButton");
        View r4 = $r3;
        ViewExtKt.show(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentTransferSummaryBinding fragmentTransferSummaryBinding, Fragment fragment) {
        Log_OC.getArray(fragmentTransferSummaryBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentTransferSummaryBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentTransferSummaryBinding $r4 = (FragmentTransferSummaryBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.TransferSummaryView
    public void navigateToTransactionStatusPage(TransactionStatus transactionStatus, String $r2, String $r3) {
        String $r32;
        SuccessScreenCustomOption successScreenCustomOption;
        boolean $z1;
        String $r22;
        SuccessScreenCustomOption r12;
        Log_OC.getArray(transactionStatus, TransactionField.STATUS);
        int[] $r4 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r4[transactionStatus.ordinal()];
        boolean $z0 = true;
        TransferSummaryFragment$navigateToTransactionStatusPage$1 $r5 = null;
        if ($i0 == 1) {
            boolean $z12 = this.isCashOutFlow;
            if ($z12) {
                TransferSummaryFragment r15 = this;
                $r32 = r15.getString(C0001R.string.text_cash_out_unsuccessful);
            } else {
                TransferSummaryFragment r152 = this;
                $r32 = r152.getString(C0001R.string.transfer_successful);
            }
            if ($r2 != null) {
                $z1 = C13276s.m5440u($r2);
                if (!$z1) {
                    $z0 = false;
                }
            }
            TransferSummaryFragment r153 = this;
            String $r7 = r153.getString($z0 ? C0001R.string.send_more : C0001R.string.view_transaction);
            Log_OC.loadImage($r32, "if (isCashOutFlow) getString(\n                        R.string.text_cash_out_unsuccessful\n                    ) else getString(\n                        R.string.transfer_successful\n                    )");
            Log_OC.loadImage($r7, "if (transactionReference.isNullOrBlank()) getString(R.string.send_more) else getString(\n                        R.string.view_transaction\n                    )");
            SuccessScreenCustomOption r122 = new SuccessScreenCustomOption($r32, null, $r7, false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_successful_transaction_status, 0, false, 7162, null);
            $r5 = r14;
            TransferSummaryFragment$navigateToTransactionStatusPage$1 r14 = new TransferSummaryFragment$navigateToTransactionStatusPage$1(this, $r2);
            successScreenCustomOption = r122;
        } else if ($i0 == 2) {
            if (this.isCashOutFlow) {
                TransferSummaryFragment r154 = this;
                $r22 = r154.getString(C0001R.string.text_cash_out_failed);
            } else {
                TransferSummaryFragment r155 = this;
                $r22 = r155.getString(C0001R.string.transfer_failed);
            }
            if ($r3 == null) {
                TransferSummaryFragment r156 = this;
                $r3 = r156.getString(C0001R.string.something_went_wrong);
                Log_OC.loadImage($r3, "getString(R.string.something_went_wrong)");
            }
            successScreenCustomOption = r12;
            Log_OC.loadImage($r22, "if (isCashOutFlow) getString(\n                        R.string.text_cash_out_failed\n                    ) else getString(\n                        R.string.transfer_failed\n                    )");
            SuccessScreenCustomOption r123 = new SuccessScreenCustomOption($r22, $r3, null, false, true, false, C0001R.color.red, C0001R.color.red, 0, 0, C0001R.C0002drawable.ic_failed_transaction_status, 0, false, 6956, null);
        } else if ($i0 != 3) {
            Throwable r13 = new NoWhenBranchMatchedException();
            Throwable r16 = r13;
            throw r16;
        } else {
            successScreenCustomOption = r12;
            String $r72 = this.isCashOutFlow ? getString(C0001R.string.text_cash_out_failed) : getString(C0001R.string.transfer_pending);
            String str = $r72;
            Log_OC.loadImage($r72, "if (isCashOutFlow) getString(\n                        R.string.text_cash_out_failed\n                    ) else getString(\n                        R.string.transfer_pending\n                    )");
            if ($r3 == null) {
                $r3 = "";
            }
            r12 = new SuccessScreenCustomOption(str, $r3, null, false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_wallet_pending, 0, false, 7164, null);
        }
        SuccessScreenDialogFragment.Companion $r9 = SuccessScreenDialogFragment.Companion;
        SuccessScreenDialogFragment $r10 = $r9.newInstance(successScreenCustomOption, $r5);
        TransferSummaryFragment r157 = this;
        FragmentManager $r11 = r157.getChildFragmentManager();
        Log_OC.loadImage($r11, "childFragmentManager");
        TransferSummaryFragment r158 = this;
        FragmentExtensionKt.showDialogWhenResumed($r10, $r11, SuccessScreenDialogFragment.PAGE_KEY, r158);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        List m3891e;
        super.onActivityCreated(bundle);
        FragmentTransferSummaryBinding $r2 = requireBinding();
        ViewGroup $r3 = $r2.createVoucherButton;
        ViewGroup r32 = $r3;
        r32.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionstatus.summary.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferSummaryFragment $r22 = TransferSummaryFragment.this;
                TransferSummaryFragment.m41304onActivityCreated$lambda2$lambda0($r22, view);
            }
        });
        SummaryAdapter r28 = new SummaryAdapter();
        RecyclerView $r6 = $r2.summaryRecyclerView;
        $r6.setAdapter(r28);
        m3891e = C13726r.m3891e();
        TransferSummaryFragment r33 = this;
        Bundle $r1 = r33.getArguments();
        if ($r1 != null) {
            TransferSummaryFragment r332 = this;
            Bundle $r12 = r332.requireArguments();
            boolean $z0 = $r12.containsKey(TRANSFER_SUMMARY_ARGS);
            if ($z0) {
                TransferSummaryFragment r333 = this;
                Bundle $r13 = r333.getArguments();
                Parcelable $r9 = $r13 == null ? null : $r13.getParcelable(TRANSFER_SUMMARY_ARGS);
                if ($r9 == null) {
                    NullPointerException r29 = new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
                    throw r29;
                }
                this.transferType = $r9;
            }
            TransferSummaryFragment r334 = this;
            Bundle $r14 = r334.requireArguments();
            boolean $z02 = $r14.containsKey(ARG_IS_CASH_OUT_FLOW);
            if ($z02) {
                TransferSummaryFragment r335 = this;
                Bundle $r15 = r335.requireArguments();
                boolean $z03 = $r15.getBoolean(ARG_IS_CASH_OUT_FLOW);
                this.isCashOutFlow = $z03;
            }
        }
        Parcelable $r92 = this.transferType;
        if ($r92 == null) {
            Log_OC.LogError("transferType");
            NullPointerException $r10 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r10;
        }
        boolean $z04 = $r92 instanceof VoucherCashInRequest;
        if (!$z04) {
            boolean $z05 = $r92 instanceof TransferToBankPayload;
            if ($z05) {
                if ($r92 == null) {
                    Log_OC.LogError("transferType");
                    NullPointerException $r102 = new NullPointerException("Null throw statement replaced by Soot");
                    throw $r102;
                }
                TransferToBankPayload $r20 = (TransferToBankPayload) $r92;
                Integer $r17 = $r20.getAmount();
                Log_OC.append($r17);
                int $i0 = $r17.intValue();
                KudiButton $r32 = $r2.createVoucherButton;
                C11780a0 $r122 = C11780a0.f26475a;
                TransferSummaryFragment r336 = this;
                String $r132 = r336.getString(C0001R.string.send_voucher);
                Log_OC.loadImage($r132, "getString(R.string.send_voucher)");
                Locale $r152 = Locale.US;
                NumberFormat $r16 = NumberFormat.getNumberInstance($r152);
                String $r18 = $r16.format(Integer.valueOf($i0));
                Object[] $r142 = {$r18};
                String $r133 = String.format($r132, Arrays.copyOf($r142, 1));
                Log_OC.loadImage($r133, "java.lang.String.format(format, *args)");
                $r32.setText($r133);
                m3891e = getBankTransferSummary($r20);
                TransferSummaryFragment r337 = this;
                FragmentActivity $r21 = r337.requireActivity();
                SharedPreferences $r22 = $r21.getSharedPreferences(LocationUtil.LOCATION_PREFERENCE, 0);
                boolean $z06 = $r22.getBoolean(LocationUtil.IS_LOCATION_ALLOWED_PREFERENCE_TRANSFER, false);
                if ($z06) {
                    displayLocationNotification();
                } else {
                    displayLocationAwareness();
                }
            }
        } else if ($r92 == null) {
            Log_OC.LogError("transferType");
            NullPointerException $r103 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r103;
        } else {
            VoucherCashInRequest $r11 = (VoucherCashInRequest) $r92;
            int $i02 = $r11.getAmount();
            KudiButton $r33 = $r2.createVoucherButton;
            C11780a0 c11780a0 = C11780a0.f26475a;
            TransferSummaryFragment r338 = this;
            String $r134 = r338.getString(C0001R.string.send_voucher);
            Log_OC.loadImage($r134, "getString(R.string.send_voucher)");
            Locale $r153 = Locale.US;
            NumberFormat $r162 = NumberFormat.getNumberInstance($r153);
            String $r182 = $r162.format(Integer.valueOf($i02 + 50));
            Object[] $r143 = {$r182};
            String $r135 = String.format($r134, Arrays.copyOf($r143, 1));
            Log_OC.loadImage($r135, "java.lang.String.format(format, *args)");
            $r33.setText($r135);
            m3891e = getVoucherTransferSummary($r11);
        }
        List $r7 = m3891e;
        r28.setSummaryList($r7);
        r28.notifyDataSetChanged();
        TransferSummaryFragment r339 = this;
        Context $r24 = r339.getContext();
        C1723k r30 = new C1723k($r24, 1);
        TransferSummaryFragment r3310 = this;
        FragmentActivity $r212 = r3310.requireActivity();
        Context $r242 = $r212.getApplicationContext();
        Drawable $r25 = C1335a.m36322f($r242, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r25);
        r30.m34703f($r25);
        RecyclerView $r62 = $r2.summaryRecyclerView;
        $r62.m35294h(r30);
        TransferSummaryFragment$onActivityCreated$1$3 r31 = new TransferSummaryFragment$onActivityCreated$1$3(this);
        r28.setOnClickListener(r31);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        TransferSummaryFragment r7 = this;
        super.onAttach(context);
        TransferSummaryFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transfer.ui.TransferActivity");
            throw r6;
        }
        TransferActivity $r3 = (TransferActivity) $r2;
        MainTransferSubComponent $r4 = $r3.getTransferSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransferSummaryBinding $r4 = FragmentTransferSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater, container,\n                false\n            )");
        TransferSummaryFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        if (i == 1000) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    handleTransfer();
                    return;
                }
            }
            LocationUtil.Companion $r4 = LocationUtil.Companion;
            TransferSummaryFragment r5 = this;
            Context $r1 = r5.requireContext();
            Log_OC.loadImage($r1, "requireContext()");
            $r4.handleDeniedPermission($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.TransferSummaryView
    public void pinConfirmationDialog() {
        TransferSummaryFragment r9 = this;
        FragmentManager $r2 = r9.getChildFragmentManager();
        TransferSummaryFragment r92 = this;
        PreferenceActivity $r3 = r92.getViewLifecycleOwner();
        $r2.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.transactionstatus.summary.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38225b(String str, Bundle bundle) {
                TransferSummaryFragment $r32 = TransferSummaryFragment.this;
                TransferSummaryFragment.m41305pinConfirmationDialog$lambda5($r32, str, bundle);
            }
        });
        TransferSummaryFragment r93 = this;
        FragmentManager $r22 = r93.getChildFragmentManager();
        TransferSummaryFragment r94 = this;
        PreferenceActivity $r32 = r94.getViewLifecycleOwner();
        $r22.p1("ERROR", $r32, new InterfaceC1523w() { // from class: ai.kudi.agent.transactionstatus.summary.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38218c(String str, Bundle bundle) {
                TransferSummaryFragment $r33 = TransferSummaryFragment.this;
                TransferSummaryFragment.m41306pinConfirmationDialog$lambda6($r33, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r6 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        TransferSummaryFragment r95 = this;
        FragmentManager $r23 = r95.getChildFragmentManager();
        Chapter r10 = (Chapter) $r6;
        r10.show($r23, ".AuthDialog.Dialog");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransferSummaryBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentTransferSummaryBinding $r3 = (FragmentTransferSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentTransferSummaryBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setLocationTracker(LocationUtil locationUtil) {
        this.locationTracker = locationUtil;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setThisPresenter(TransferSummaryPresenter transferSummaryPresenter) {
        Log_OC.getArray(transferSummaryPresenter, "<set-?>");
        this.thisPresenter = transferSummaryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.TransferSummaryView
    public void showError(String str) {
        TransferSummaryFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.TransferSummaryView
    public void showLoading() {
        FragmentTransferSummaryBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.progressBar;
        Log_OC.loadImage($r2, "progressBar");
        ViewExtKt.show($r2);
        View $r3 = $r1.createVoucherButton;
        Log_OC.loadImage($r3, "createVoucherButton");
        View r4 = $r3;
        ViewExtKt.hide$default(r4, false, 1, null);
    }
}
