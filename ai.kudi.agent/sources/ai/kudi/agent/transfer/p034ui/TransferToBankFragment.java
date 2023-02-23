package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.domain.room_entities.BankAccount;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentTransferToBankBinding;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.transfer.adapter.RecentTransfersAdapter;
import ai.kudi.agent.transfer.domain.models.TransactionRecipient;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.presenter.TransferToBankPresenter;
import ai.kudi.agent.transfer.views.TransferToBankView;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11810u;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransferToBankFragment.kt */
@Metadata(m10422d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001TB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0016J\u0019\u0010$\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0096\u0001J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J&\u00101\u001a\u0004\u0018\u00010%2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u00020\u001fH\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\u001fH\u0016J\u001a\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u000100H\u0017J\t\u0010>\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u001fH\u0002J\u0010\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020-H\u0016J\u0010\u0010E\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020\u001fH\u0016J\b\u0010H\u001a\u00020\u001fH\u0016J\u0010\u0010I\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010J\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u000fH\u0016J(\u0010M\u001a\u00020\u001f2\u0016\u0010N\u001a\u0012\u0012\u0004\u0012\u00020:0Oj\b\u0012\u0004\u0012\u00020:`P2\u0006\u0010Q\u001a\u00020\u000fH\u0016J\u0010\u0010R\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u000fH\u0016J\u0010\u0010S\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006U"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToBankFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/transfer/views/TransferToBankView;", "Lai/kudi/agent/transfer/presenter/TransferToBankPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentTransferToBankBinding;", "()V", "accountNumberListener", "Lio/reactivex/disposables/Disposable;", "adapter", "Lai/kudi/agent/transfer/adapter/RecentTransfersAdapter;", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentTransferToBankBinding;", "isCashOutFlow", "", "isFromSummaryPage", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "recentTransferRecipientExist", "recentTransferTxnLoaded", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "showRecentTransfer", "textChangeTriggeredByKeypad", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transfer/presenter/TransferToBankPresenter;", "setThisPresenter", "(Lai/kudi/agent/transfer/presenter/TransferToBankPresenter;)V", "clearTransferSuggestion", "", "createPresenter", "getAccountDetail", "gotoNextPage", "hideAccountNameLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onBankAccountUnavailable", "msg", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onRecipientClicked", "item", "Lai/kudi/agent/transfer/domain/models/TransactionRecipient;", "onStart", "onViewCreated", "view", "requireBinding", "setAccountDetailViews", "account", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "setKeypadCallback", "showAccountName", BanksWithMethods.ACCOUNT_NAME, "showAccountNameError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showAccountNameLoading", "showBankOptions", "showInvalidAccountNoError", "showInvalidBankError", "showTransferItemSection", "show", "showTransferLookUpResult", "uniqueAccount", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "transferTnxLoaded", "toggleRecentTrfTxnLoader", "toggleTabsAndAppBar", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToBankFragment */
/* loaded from: classes.dex */
public final class TransferToBankFragment extends AbstractC9412c<TransferToBankView, TransferToBankPresenter> implements TransferToBankView, BaseViewBinder<FragmentTransferToBankBinding> {
    public static final String ARGS_PAYLOAD = "args_transfer_payload";
    public static final String ARGS_SOURCE = "args_is_from_summary_page";
    public static final Companion Companion;
    public static final String KEY_IS_CASH_OUT = "key_is_cash_out";
    private final /* synthetic */ BaseViewBinderImpl<FragmentTransferToBankBinding> $$delegate_0;
    private FavoritesArrayAdapter accountNumberListener;
    private RecentTransfersAdapter adapter;
    private boolean isCashOutFlow;
    private boolean isFromSummaryPage;
    private TransferToBankPayload payload;
    private boolean recentTransferRecipientExist;
    private boolean recentTransferTxnLoaded;
    private Bank selectedBank;
    private boolean showRecentTransfer;
    private boolean textChangeTriggeredByKeypad;
    public TransferToBankPresenter thisPresenter;

    /* compiled from: TransferToBankFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToBankFragment$Companion;", "", "()V", "ARGS_PAYLOAD", "", "ARGS_SOURCE", "KEY_IS_CASH_OUT", "newInstance", "Lai/kudi/agent/transfer/ui/TransferToBankFragment;", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "isFromSummaryPage", "", "isCashOut", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transfer.ui.TransferToBankFragment$Companion */
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
        public static /* synthetic */ TransferToBankFragment newInstance$default(Companion companion, TransferToBankPayload $r2, boolean z, boolean $z1, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = null;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $z1 = false;
            }
            TransferToBankFragment $r0 = companion.newInstance($r2, z, $z1);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransferToBankFragment newInstance(TransferToBankPayload transferToBankPayload, boolean z, boolean z2) {
            TransferToBankFragment r5 = new TransferToBankFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable("args_transfer_payload", transferToBankPayload);
            r6.putBoolean("args_is_from_summary_page", z);
            r6.putBoolean(TransferToBankFragment.KEY_IS_CASH_OUT, z2);
            C13666w c13666w = C13666w.f30112a;
            TransferToBankFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
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
    public TransferToBankFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.showRecentTransfer = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getAccountDetail() {
        InterfaceC9413d $r1 = this.presenter;
        TransferToBankPresenter $r2 = (TransferToBankPresenter) $r1;
        $r2.getAccountDetail();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void gotoNextPage() {
        FragmentTransferToBankBinding $r1 = requireBinding();
        KudiInputField $r2 = $r1.accountNumberField;
        String $r3 = $r2 == null ? null : $r2.getText();
        Bank $r4 = this.selectedBank;
        TextView $r5 = $r1.accountNameField;
        CharSequence $r6 = $r5.getText();
        String $r7 = $r6.toString();
        TransferToBankPresenter $r8 = getThisPresenter();
        TransferToBankPayload $r9 = this.payload;
        if ($r9 == null) {
            $r9 = new TransferToBankPayload(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        Log_OC.append($r4);
        String $r10 = $r4.getBankCode();
        TransferToBankPayload $r92 = TransferToBankPayload.copy$default($r9, $r3, $r10, null, null, $r7, null, null, null, null, null, null, null, null, 8172, null);
        boolean $z0 = this.isFromSummaryPage;
        boolean $z1 = this.isCashOutFlow;
        $r8.continueToNextPage($r92, $z0, $z1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onRecipientClicked(TransactionRecipient transactionRecipient) {
        FragmentTransferToBankBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.accountNumberField;
        String $r4 = transactionRecipient.getAccountNumber();
        $r3.setText($r4);
        TextView $r5 = $r2.accountNameField;
        String $r42 = transactionRecipient.getAccountName();
        $r5.setText($r42);
        KudiInputField $r32 = $r2.bankField;
        String $r43 = transactionRecipient.getBank();
        $r32.setText($r43);
        String $r44 = transactionRecipient.getAccountName();
        String $r6 = $r44;
        if ($r44 == null) {
            $r6 = "";
        }
        showAccountName($r6);
        Bank.BanksList r12 = new Bank.BanksList();
        String $r45 = transactionRecipient.getRecipientBankCode();
        int $i0 = r12.locateBank($r45);
        this.showRecentTransfer = false;
        if ($i0 >= 0) {
            Bank.BanksList r122 = new Bank.BanksList();
            List $r8 = r122.getListOfBanks();
            Object $r9 = $r8.get($i0);
            Bank $r10 = (Bank) $r9;
            this.selectedBank = $r10;
            gotoNextPage();
            return;
        }
        showTransferItemSection(false);
        KudiInputField $r33 = $r2.bankField;
        $r33.setText("");
        TextView $r52 = $r2.accountNameField;
        $r52.setText("");
        View $r11 = $r2.continueToNextPage;
        Log_OC.loadImage($r11, "continueToNextPage");
        View r13 = $r11;
        ViewExtKt.hide$default(r13, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-9$lambda-2 */
    public static final void m41383onViewCreated$lambda9$lambda2(TransferToBankFragment transferToBankFragment, FragmentTransferToBankBinding fragmentTransferToBankBinding, C11810u c11810u, CharSequence charSequence) {
        Log_OC.getArray(transferToBankFragment, "this$0");
        Log_OC.getArray(fragmentTransferToBankBinding, "$this_apply");
        Log_OC.getArray(c11810u, "$reloadAccountLookup");
        String $r4 = charSequence.toString();
        boolean $z0 = transferToBankFragment.textChangeTriggeredByKeypad;
        if (!$z0) {
            PinpadView $r5 = fragmentTransferToBankBinding.keyboard;
            $r5.setPasscode($r4);
        }
        transferToBankFragment.textChangeTriggeredByKeypad = false;
        transferToBankFragment.showRecentTransfer = false;
        int $i0 = $r4.length();
        boolean $z02 = $i0 > 0;
        if (!$z02) {
            transferToBankFragment.showRecentTransfer = true;
            View $r10 = fragmentTransferToBankBinding.continueToNextPage;
            Log_OC.loadImage($r10, "continueToNextPage");
            View r11 = $r10;
            ViewExtKt.hide$default(r11, false, 1, null);
            boolean $z03 = transferToBankFragment.recentTransferRecipientExist;
            if ($z03) {
                transferToBankFragment.showTransferItemSection(true);
                return;
            }
            return;
        }
        int $i02 = $r4.length();
        if ($i02 < 7) {
            TransferToBankPresenter $r6 = transferToBankFragment.getThisPresenter();
            $r6.disposeLookupProcess();
            c11810u.f26497c = true;
            InterfaceC9413d $r7 = transferToBankFragment.presenter;
            TransferToBankPresenter $r62 = (TransferToBankPresenter) $r7;
            $r62.fetchRecentTransfers(charSequence.toString());
            transferToBankFragment.showRecentTransfer = true;
            return;
        }
        int $i03 = $r4.length();
        if ($i03 != 10) {
            transferToBankFragment.showRecentTransfer = false;
            TransferToBankPresenter $r63 = transferToBankFragment.getThisPresenter();
            $r63.disposeLookupProcess();
            transferToBankFragment.showTransferItemSection(false);
            TransferToBankView.DefaultImpls.toggleRecentTrfTxnLoader$default(transferToBankFragment, false, 1, null);
            return;
        }
        Bank $r8 = transferToBankFragment.selectedBank;
        if ($r8 != null) {
            boolean $z04 = c11810u.f26497c;
            if ($z04) {
                TransferToBankPresenter $r64 = transferToBankFragment.getThisPresenter();
                $r64.disposeLookupProcess();
                TransferToBankPresenter $r65 = transferToBankFragment.getThisPresenter();
                KudiInputField $r9 = fragmentTransferToBankBinding.accountNumberField;
                String $r42 = $r9.getText();
                Bank $r82 = transferToBankFragment.selectedBank;
                $r65.performLookup($r42, $r82);
            }
        }
    }

    /* renamed from: onViewCreated$lambda-9$lambda-3 */
    public static final void m41384onViewCreated$lambda9$lambda3(Throwable th) {
        th.printStackTrace();
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-9$lambda-4 */
    public static final boolean m41385onViewCreated$lambda9$lambda4(View view, MotionEvent motionEvent) {
        view.onTouchEvent(motionEvent);
        Context $r2 = view.getContext();
        Object $r3 = $r2.getSystemService("input_method");
        if ($r3 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            throw $r6;
        }
        InputMethodManager $r4 = (InputMethodManager) $r3;
        IBinder $r5 = view.getWindowToken();
        $r4.hideSoftInputFromWindow($r5, 0);
        return true;
    }

    /* renamed from: onViewCreated$lambda-9$lambda-5 */
    public static final void m41386onViewCreated$lambda9$lambda5(TransferToBankFragment transferToBankFragment, View view) {
        Log_OC.getArray(transferToBankFragment, "this$0");
        transferToBankFragment.gotoNextPage();
    }

    /* renamed from: onViewCreated$lambda-9$lambda-6 */
    public static final void m41387onViewCreated$lambda9$lambda6(TransferToBankFragment transferToBankFragment, View view) {
        Log_OC.getArray(transferToBankFragment, "this$0");
        transferToBankFragment.showBankOptions();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-9$lambda-7 */
    public static final void m41388onViewCreated$lambda9$lambda7(FragmentTransferToBankBinding fragmentTransferToBankBinding, View view) {
        Log_OC.getArray(fragmentTransferToBankBinding, "$this_apply");
        ViewGroup $r2 = fragmentTransferToBankBinding.bankField;
        ViewGroup r3 = $r2;
        r3.performClick();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-9$lambda-8 */
    public static final void m41389onViewCreated$lambda9$lambda8(TransferToBankFragment transferToBankFragment, View view) {
        Log_OC.getArray(transferToBankFragment, "this$0");
        InterfaceC9413d $r2 = transferToBankFragment.presenter;
        TransferToBankPresenter $r3 = (TransferToBankPresenter) $r2;
        $r3.sendToMultiple();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setKeypadCallback() {
        final FragmentTransferToBankBinding $r3 = requireBinding();
        PinpadView $r1 = $r3.keyboard;
        $r1.setViewProvider(new PinpadView.InterfaceC0836d() { // from class: ai.kudi.agent.transfer.ui.TransferToBankFragment$setKeypadCallback$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onAppendChar(String str) {
                String $r5;
                Log_OC.getArray(str, "char");
                FragmentTransferToBankBinding $r2 = FragmentTransferToBankBinding.this;
                KudiInputField $r32 = $r2.accountNumberField;
                Integer $r4 = null;
                if ($r32 != null && ($r5 = $r32.getText()) != null) {
                    int $i0 = $r5.length();
                    $r4 = Integer.valueOf($i0);
                }
                Log_OC.append($r4);
                int $i02 = $r4.intValue();
                if ($i02 <= 10) {
                    TransferToBankFragment $r6 = this;
                    $r6.textChangeTriggeredByKeypad = true;
                    FragmentTransferToBankBinding $r22 = FragmentTransferToBankBinding.this;
                    EditText $r7 = $r22.accountNumberField.getEditText();
                    $r7.append(str);
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onDeleteChar() {
                int $i0;
                FragmentTransferToBankBinding $r12 = FragmentTransferToBankBinding.this;
                KudiInputField $r2 = $r12.accountNumberField;
                if ($r2 == null) {
                    return;
                }
                int $i02 = $r2.getText().length();
                boolean $z0 = $i02 > 0;
                if ($z0) {
                    String $r32 = $r2.getText();
                    String $r4 = $r2.getText();
                    $i0 = C13277t.m5410Q($r4);
                    if ($r32 == null) {
                        NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        throw $r6;
                    }
                    String $r33 = $r32.substring(0, $i0);
                    Log_OC.loadImage($r33, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    $r2.setText($r33);
                    EditText $r5 = $r2.getInputEditText();
                    int $i03 = $r2.getText().length();
                    $r5.setSelection($i03);
                }
            }

            public void onReset() {
            }

            public void setNumDigits(int i) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleTabsAndAppBar(boolean z) {
        TransferToBankFragment r5 = this;
        boolean $z1 = r5.getActivity() instanceof TransferActivity;
        if ($z1) {
            TransferToBankFragment r52 = this;
            FragmentActivity $r1 = r52.getActivity();
            if ($r1 == null) {
                NullPointerException r4 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transfer.ui.TransferActivity");
                throw r4;
            }
            TransferActivity $r2 = (TransferActivity) $r1;
            $r2.toggleAppBarAndTabLayout(z);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void clearTransferSuggestion() {
        RecentTransfersAdapter $r2 = this.adapter;
        if ($r2 != null) {
            ArrayList $r1 = new ArrayList();
            $r2.swapData($r1);
            return;
        }
        Log_OC.LogError("adapter");
        NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
        throw r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransferToBankPresenter createPresenter() {
        TransferToBankPresenter $r1 = getThisPresenter();
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
    public FragmentTransferToBankBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentTransferToBankBinding $r3 = (FragmentTransferToBankBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentTransferToBankBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransferToBankPresenter getThisPresenter() {
        TransferToBankPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void hideAccountNameLoading() {
        FragmentTransferToBankBinding $r1 = requireBinding();
        View $r2 = $r1.accountLookupLoader;
        Log_OC.loadImage($r2, "requireBinding().accountLookupLoader");
        View r3 = $r2;
        ViewExtKt.hide$default(r3, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentTransferToBankBinding fragmentTransferToBankBinding, Fragment fragment) {
        Log_OC.getArray(fragmentTransferToBankBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentTransferToBankBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentTransferToBankBinding $r4 = (FragmentTransferToBankBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        TransferToBankFragment r7 = this;
        super.onAttach(context);
        TransferToBankFragment r72 = this;
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
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void onBankAccountUnavailable(String str) {
        Log_OC.getArray(str, "msg");
        TransferToBankFragment r6 = this;
        FragmentActivity $r2 = r6.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast($r2, str, 0);
        TransferToBankFragment r62 = this;
        r62.requireActivity().finish();
        TransferToBankFragment r63 = this;
        Intent r5 = new Intent(r63.getActivity(), SettingsActivity.class);
        r5.putExtra("PARAM_SETTINGS", Constants.SETTINGS_PARAM_ADD_BANK_ACCT);
        C13666w c13666w = C13666w.f30112a;
        TransferToBankFragment r64 = this;
        r64.startActivity(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TransferToBankFragment r4 = this;
        FragmentActivity $r2 = r4.requireActivity();
        Window $r3 = $r2.getWindow();
        $r3.setSoftInputMode(3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransferToBankBinding $r4 = FragmentTransferToBankBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        TransferToBankFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        TransferToBankPresenter $r1 = getThisPresenter();
        $r1.disposeLookupProcess();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FavoritesArrayAdapter $r2 = this.accountNumberListener;
        if ($r2 == null) {
            Log_OC.LogError("accountNumberListener");
            NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
            throw r3;
        }
        $r2.backup();
        TransferToBankPresenter $r1 = getThisPresenter();
        $r1.disposeLookupProcess();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        boolean $z0 = this.isCashOutFlow;
        if ($z0) {
            getAccountDetail();
            return;
        }
        TransferToBankPresenter $r1 = getThisPresenter();
        $r1.fetchRecentTransfers(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        final FragmentTransferToBankBinding $r3 = requireBinding();
        toggleTabsAndAppBar(true);
        final C11810u r35 = new C11810u();
        r35.f26497c = true;
        Object[] $r5 = new Object[0];
        Timber.wtf("This fragment's onViewCreated", $r5);
        TransferToBankFragment r45 = this;
        Bundle $r2 = r45.getArguments();
        if ($r2 != null) {
            boolean $z0 = $r2.containsKey("args_transfer_payload");
            if ($z0) {
                Parcelable $r6 = $r2.getParcelable("args_transfer_payload");
                this.payload = (TransferToBankPayload) $r6;
            }
            boolean $z02 = $r2.containsKey(KEY_IS_CASH_OUT);
            if ($z02) {
                boolean $z03 = $r2.getBoolean(KEY_IS_CASH_OUT);
                this.isCashOutFlow = $z03;
            }
            boolean $z04 = $r2.containsKey("args_is_from_summary_page");
            if ($z04) {
                boolean $z05 = $r2.getBoolean("args_is_from_summary_page");
                this.isFromSummaryPage = $z05;
            }
        }
        TransferToBankPayload $r7 = this.payload;
        if ($r7 != null) {
            KudiInputField $r8 = $r3.accountNumberField;
            String $r9 = $r7.getAccountNumber();
            Log_OC.append($r9);
            $r8.setText($r9);
            Bank.BanksList r36 = new Bank.BanksList();
            List $r11 = r36.getListOfBanks();
            Bank.BanksList r362 = new Bank.BanksList();
            int $i0 = r362.locateBank($r7.getBankCode());
            Object $r12 = C13722p.m3951U($r11, $i0);
            Bank $r13 = (Bank) $r12;
            this.selectedBank = $r13;
            KudiInputField $r82 = $r3.bankField;
            $r82.setText($r13 == null ? null : $r13.getName());
            if (this.selectedBank != null) {
                TextView $r14 = $r3.accountNameField;
                $r14.setText($r7.getAccountName());
                View $r15 = $r3.continueToNextPage;
                Log_OC.loadImage($r15, "continueToNextPage");
                View $r1 = $r15;
                ViewExtKt.show($r1);
                PinpadView $r16 = $r3.keyboard;
                $r16.setPasscode($r7.getAccountNumber());
                r35.f26497c = false;
            }
        }
        KudiInputField $r83 = $r3.accountNumberField;
        EditText $r17 = $r83.getEditText();
        AbstractC11688p $r18 = EditTextExtKt.getTextChanges($r17);
        Object object = new Object() { // from class: ai.kudi.agent.transfer.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankFragment $r19 = TransferToBankFragment.this;
                FragmentTransferToBankBinding $r22 = $r3;
                C11810u $r32 = r35;
                CharSequence $r52 = (CharSequence) obj;
                TransferToBankFragment.m41383onViewCreated$lambda9$lambda2($r19, $r22, $r32, $r52);
            }
        };
        Preferences $r20 = Preferences.singleton;
        FavoritesArrayAdapter $r21 = $r18.e0(object, $r20);
        Log_OC.loadImage($r21, "accountNumberField.getEditText().textChanges\n                .subscribe(\n                    {\n                        val accountNumber = it.toString()\n                        if (!textChangeTriggeredByKeypad) {\n                            keyboard.setPasscode(accountNumber)\n                        }\n                        textChangeTriggeredByKeypad = false\n\n                        showRecentTransfer = false\n\n                        when {\n                            accountNumber.isNotEmpty() -> {\n                                if (accountNumber.length < 7) {\n                                    thisPresenter.disposeLookupProcess()\n                                    reloadAccountLookup = true\n                                    presenter.fetchRecentTransfers(it.toString())\n                                    showRecentTransfer = true\n                                } else if (accountNumber.length == 10) {\n                                    if (selectedBank != null && reloadAccountLookup) {\n                                        thisPresenter.disposeLookupProcess()\n                                        thisPresenter.performLookup(\n                                            accountNumberField.getText(),\n                                            selectedBank\n                                        )\n                                    }\n                                } else {\n                                    showRecentTransfer = false\n                                    thisPresenter.disposeLookupProcess()\n                                    showTransferItemSection(false)\n                                    toggleRecentTrfTxnLoader()\n                                }\n                            }\n                            else -> {\n                                showRecentTransfer = true\n                                continueToNextPage.hide()\n                                if (recentTransferRecipientExist) {\n                                    showTransferItemSection(true)\n                                }\n                            }\n                        }\n                    },\n                    {\n                        it.printStackTrace()\n                        CrashlyticsReport.logException(it)\n                    }\n                )");
        this.accountNumberListener = $r21;
        KudiInputField $r84 = $r3.accountNumberField;
        EditText $r172 = $r84.getEditText();
        $r172.setEnabled(true);
        KudiInputField $r85 = $r3.accountNumberField;
        EditText $r173 = $r85.getEditText();
        $r173.setFocusable(true);
        KudiInputField $r86 = $r3.accountNumberField;
        EditText $r174 = $r86.getEditText();
        $r174.setClickable(true);
        KudiInputField $r87 = $r3.accountNumberField;
        EditText $r175 = $r87.getEditText();
        $r175.requestFocus();
        KudiInputField $r88 = $r3.accountNumberField;
        EditText $r176 = $r88.getEditText();
        Token $r22 = Token.previous;
        $r176.setOnTouchListener($r22);
        KudiInputField $r89 = $r3.bankField;
        EditText $r177 = $r89.getEditText();
        $r177.setFocusable(false);
        KudiInputField $r810 = $r3.bankField;
        EditText $r178 = $r810.getEditText();
        $r178.setClickable(true);
        KudiInputField $r811 = $r3.bankField;
        EditText $r179 = $r811.getEditText();
        $r179.setLongClickable(false);
        setKeypadCallback();
        ViewGroup r46 = $r3.continueToNextPage;
        r46.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransferToBankFragment $r23 = TransferToBankFragment.this;
                TransferToBankFragment.m41386onViewCreated$lambda9$lambda5($r23, view2);
            }
        });
        TransferToBankFragment$onViewCreated$1$7 r39 = new TransferToBankFragment$onViewCreated$1$7(this);
        RecentTransfersAdapter r40 = new RecentTransfersAdapter(null, r39, 1, null);
        this.adapter = r40;
        RecyclerView $r26 = $r3.recentTransfers;
        if (r40 == null) {
            Log_OC.LogError("adapter");
            NullPointerException r34 = new NullPointerException("Null throw statement replaced by Soot");
            throw r34;
        }
        $r26.setAdapter(r40);
        RecyclerView $r262 = $r3.recentTransfers;
        TransferToBankFragment r452 = this;
        Context $r28 = r452.getContext();
        LinearLayoutManager r41 = new LinearLayoutManager($r28);
        $r262.setLayoutManager(r41);
        boolean $z06 = this.isCashOutFlow;
        if ($z06) {
            showTransferItemSection(false);
            KudiInputField $r812 = $r3.accountNumberField;
            EditText $r1710 = $r812.getEditText();
            $r1710.setEnabled(false);
            KudiInputField $r813 = $r3.bankField;
            EditText $r1711 = $r813.getEditText();
            $r1711.setEnabled(false);
            View $r152 = $r3.continueToNextPage;
            Log_OC.loadImage($r152, "continueToNextPage");
            View $r19 = $r152;
            ViewExtKt.show($r19);
        } else {
            ViewGroup $r814 = $r3.bankField;
            ViewGroup r462 = $r814;
            r462.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.k
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TransferToBankFragment $r23 = TransferToBankFragment.this;
                    TransferToBankFragment.m41387onViewCreated$lambda9$lambda6($r23, view2);
                }
            });
            KudiInputField $r815 = $r3.bankField;
            EditText $r1712 = $r815.getEditText();
            $r1712.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.SearchResultsFragment$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FragmentTransferToBankBinding $r23 = FragmentTransferToBankBinding.this;
                    TransferToBankFragment.m41388onViewCreated$lambda9$lambda7($r23, view2);
                }
            });
            TransferToBankPresenter $r31 = getThisPresenter();
            $r31.checkCachedLastTransferLookUpResult();
        }
        Button $r32 = $r3.sendToMultipleButton;
        Button r47 = $r32;
        r47.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TransferToBankFragment $r23 = TransferToBankFragment.this;
                TransferToBankFragment.m41389onViewCreated$lambda9$lambda8($r23, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransferToBankBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentTransferToBankBinding $r3 = (FragmentTransferToBankBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentTransferToBankBinding $r1 = requireBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void setAccountDetailViews(BankAccount bankAccount) {
        Log_OC.getArray(bankAccount, "account");
        FragmentTransferToBankBinding $r2 = requireBinding();
        Bank.BanksList $r3 = new Bank.BanksList();
        List $r4 = $r3.getListOfBanks();
        Bank.BanksList $r32 = new Bank.BanksList();
        String $r5 = bankAccount.getBankCode();
        int $i0 = $r32.locateBank($r5);
        Object $r6 = $r4.get($i0);
        Bank $r7 = (Bank) $r6;
        this.selectedBank = $r7;
        TextView $r8 = $r2.accountNameField;
        String $r52 = bankAccount.getAccountName();
        $r8.setText($r52);
        KudiInputField $r9 = $r2.accountNumberField;
        String $r53 = bankAccount.getAccountNumber();
        $r9.setText($r53);
        KudiInputField $r92 = $r2.bankField;
        String $r54 = bankAccount.getBankName();
        $r92.setText($r54);
        gotoNextPage();
    }

    public final void setThisPresenter(TransferToBankPresenter transferToBankPresenter) {
        Log_OC.getArray(transferToBankPresenter, "<set-?>");
        this.thisPresenter = transferToBankPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showAccountName(String str) {
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NAME);
        FragmentTransferToBankBinding $r2 = requireBinding();
        TextView $r1 = $r2.accountNameField;
        $r1.setText(str);
        View $r4 = $r2.continueToNextPage;
        Log_OC.loadImage($r4, "continueToNextPage");
        View r5 = $r4;
        ViewExtKt.show(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showAccountNameError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        FragmentTransferToBankBinding $r1 = requireBinding();
        View $r3 = $r1.continueToNextPage;
        Log_OC.loadImage($r3, "continueToNextPage");
        View r6 = $r3;
        ViewExtKt.hide$default(r6, false, 1, null);
        KudiInputField $r4 = $r1.accountNumberField;
        $r4.setError(str);
        TextView $r5 = $r1.accountNameField;
        $r5.setText("");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showAccountNameLoading() {
        FragmentTransferToBankBinding $r1 = requireBinding();
        View $r2 = $r1.accountLookupLoader;
        Log_OC.loadImage($r2, "accountLookupLoader");
        View r4 = $r2;
        ViewExtKt.show(r4);
        TextView $r3 = $r1.accountNameField;
        $r3.setText("");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showBankOptions() {
        BanksFragment.Companion $r1 = BanksFragment.Companion;
        Bank $r2 = this.selectedBank;
        String $r3 = $r2 == null ? null : $r2.getBankCode();
        BanksFragment $r4 = $r1.newInstance($r3);
        TransferToBankFragment$showBankOptions$1 r8 = new TransferToBankFragment$showBankOptions$1($r4, this);
        $r4.setOnBankSelectedListener(r8);
        TransferToBankFragment r9 = this;
        FragmentManager $r6 = r9.getChildFragmentManager();
        String $r32 = BanksFragment.class.getCanonicalName();
        $r4.show($r6, $r32);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showInvalidAccountNoError(String str) {
        Log_OC.getArray(str, "msg");
        FragmentTransferToBankBinding $r1 = requireBinding();
        View $r3 = $r1.continueToNextPage;
        Log_OC.loadImage($r3, "continueToNextPage");
        View r6 = $r3;
        ViewExtKt.hide$default(r6, false, 1, null);
        KudiInputField $r4 = $r1.accountNumberField;
        $r4.setError(str);
        TextView $r5 = $r1.accountNameField;
        $r5.setText("");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showInvalidBankError(String str) {
        Log_OC.getArray(str, "msg");
        FragmentTransferToBankBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.bankField;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showTransferItemSection(boolean z) {
        FragmentTransferToBankBinding $r1 = requireBinding();
        if (z) {
            View $r2 = $r1.recentTransfers;
            Log_OC.loadImage($r2, "recentTransfers");
            View r5 = $r2;
            ViewExtKt.show(r5);
            View $r3 = $r1.otherFields;
            Log_OC.loadImage($r3, "otherFields");
            View r52 = $r3;
            ViewExtKt.hide$default(r52, false, 1, null);
        } else {
            View $r22 = $r1.recentTransfers;
            Log_OC.loadImage($r22, "recentTransfers");
            View r53 = $r22;
            ViewExtKt.hide$default(r53, false, 1, null);
            View $r32 = $r1.otherFields;
            Log_OC.loadImage($r32, "otherFields");
            View r54 = $r32;
            ViewExtKt.show(r54);
        }
        boolean $z0 = this.recentTransferTxnLoaded;
        if (!$z0) {
            boolean $z02 = this.showRecentTransfer;
            if ($z02) {
                View $r4 = $r1.transferTnxLookupLoader;
                Log_OC.loadImage($r4, "transferTnxLookupLoader");
                View r55 = $r4;
                ViewExtKt.show(r55);
                return;
            }
        }
        View $r42 = $r1.transferTnxLookupLoader;
        Log_OC.loadImage($r42, "transferTnxLookupLoader");
        View r56 = $r42;
        ViewExtKt.hide$default(r56, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void showTransferLookUpResult(ArrayList arrayList, boolean z) {
        Log_OC.getArray(arrayList, "uniqueAccount");
        TransactionRecipient r7 = new TransactionRecipient("Recent Transfers", null, null, null);
        arrayList.add(0, r7);
        RecentTransfersAdapter $r3 = this.adapter;
        if ($r3 == null) {
            Log_OC.LogError("adapter");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        $r3.swapData(arrayList);
        boolean $z1 = arrayList.isEmpty();
        this.recentTransferRecipientExist = !$z1;
        FragmentTransferToBankBinding $r4 = requireBinding();
        View $r5 = $r4.transferTnxLookupLoader;
        Log_OC.loadImage($r5, "requireBinding().transferTnxLookupLoader");
        View r8 = $r5;
        ViewExtKt.hide$default(r8, false, 1, null);
        this.recentTransferTxnLoaded = z;
        boolean $z0 = this.showRecentTransfer;
        if ($z0) {
            showTransferItemSection(true);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankView
    public void toggleRecentTrfTxnLoader(boolean z) {
        FragmentTransferToBankBinding $r1 = requireBinding();
        View $r2 = $r1.transferTnxLookupLoader;
        if ($r2 == null) {
            return;
        }
        if (z) {
            View r3 = $r2;
            ViewExtKt.show(r3);
            return;
        }
        View r32 = $r2;
        ViewExtKt.hide$default(r32, false, 1, null);
    }
}
