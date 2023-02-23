package ai.kudi.agent.mpos;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ActivityMposBinding;
import ai.kudi.agent.mpos.presentation.Contract;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.fragment.app.FragmentManager;
import com.paypad.facade.PayPadManager;
import com.paypad.impl.Paypad;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MPOSActivity.kt */
@Metadata(m10422d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00101\u001a\n 3*\u0004\u0018\u00010202H\u0002J\b\u00104\u001a\u000205H\u0016J\"\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0012\u0010;\u001a\u0002052\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\b\u0010>\u001a\u000205H\u0014J\b\u0010?\u001a\u000205H\u0014J\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020AJ\b\u0010C\u001a\u000205H\u0016J\b\u0010D\u001a\u000205H\u0016J\b\u0010E\u001a\u000205H\u0002J\b\u0010F\u001a\u000205H\u0003J\b\u0010G\u001a\u000205H\u0003J\u0010\u0010H\u001a\u0002052\u0006\u0010I\u001a\u00020\u0005H\u0016J\b\u0010J\u001a\u000205H\u0016J\b\u0010K\u001a\u000205H\u0016J\u0010\u0010L\u001a\u0002052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010M\u001a\u0002052\u0006\u0010N\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b.\u0010/¨\u0006P"}, m10421d2 = {"Lai/kudi/agent/mpos/MPOSActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lai/kudi/agent/mpos/presentation/Contract$View;", "()V", "accountType", "", "getAccountType", "()Ljava/lang/String;", "setAccountType", "(Ljava/lang/String;)V", "activationCodeDialog", "Lai/kudi/agent/mpos/RequestActivationCodeDialog;", "getActivationCodeDialog", "()Lai/kudi/agent/mpos/RequestActivationCodeDialog;", "activationCodeDialog$delegate", "Lkotlin/Lazy;", TransactionField.AMOUNT, "", "getAmount", "()I", "setAmount", "(I)V", "binding", "Lai/kudi/agent/databinding/ActivityMposBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityMposBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityMposBinding;)V", "paypad", "Lcom/paypad/impl/Paypad;", "getPaypad", "()Lcom/paypad/impl/Paypad;", "paypad$delegate", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "responseReceiver", "Landroid/content/BroadcastReceiver;", "getResponseReceiver", "()Landroid/content/BroadcastReceiver;", "setResponseReceiver", "(Landroid/content/BroadcastReceiver;)V", "statusTextView", "Landroid/widget/TextView;", "getStatusTextView", "()Landroid/widget/TextView;", "statusTextView$delegate", "getPreference", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "hideLoading", "", "onActivityResult", "requestCode", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "paypadActivated", "", "paypadInitialized", "requestAccountType", "requestActivationCode", "sendRequestToPaypad", "setPaypadActivated", "setPaypadInitialized", "showActivationError", "reason", "showInitializationNotCompleted", "showLoading", OpsMetricTracker.START, "updateStatusText", TransactionField.STATUS, "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MPOSActivity extends AppCompatActivity implements Contract.View {
    public static final Companion Companion;
    public static final String EXTRA_ACCOUNT_TYPE = "mposactivity.extra_account_type";
    public static final String EXTRA_AMOUNT = "mposactivity.extra_amount";
    public static final String EXTRA_CALLBACK_URL = "mposactivity.extra_callback_url";
    public static final String EXTRA_CARD_HOLDER = "mposactivity.extra_cardholder";
    public static final String EXTRA_CARD_NO = "mposactivity.extra_cardno";
    public static final String EXTRA_RESPONSE = "mposactivity.extra_reason";
    public static final String EXTRA_RESPONSE_CODE = "mposactivity.extra_reason_code";
    public static final String EXTRA_RRN = "mposactivity.extra_rrn";
    public static final String EXTRA_TERMINAL_ID = "mposactivity.extra_terminal_id";
    public static final String EXTRA_TRANSACTION_ID = "mposactivity.extra_transaction_id";
    public static final String PAYPAD_RESPONSE_ACTIVATION_FAILED = "failedactivation";
    public static final String PAYPAD_RESPONSE_ACTIVATION_SUCCESS = "activatecomplete";
    public static final String PAYPAD_RESPONSE_ENTER_PIN = "enterPIN";
    public static final String PAYPAD_RESPONSE_INITIALIZE_COMPLETE = "Initializecomplete";
    public static final String PAYPAD_RESPONSE_INITIALIZE_NOT_COMPLETE = "initializenotcomplete";
    public static final String PAYPAD_RESPONSE_INSERT_CARD = "stopInsertStartBusy";
    public static final String PAYPAD_RESPONSE_START_INITIALIZATION = "startInitializeprogress";
    public static final String PAYPAD_RESPONSE_STOP = "stop";
    public static final String PAYPAD_RESPONSE_TRANSACTION_RESPONSE = "transactionresponse";
    public static final String PREF_IS_ACTIVATED = "mpostactivity.preference_is_activated";
    public static final String PREF_IS_INITIALIZED = "mpostactivity.preference_is_initialized";
    public static final String PREF_NAME = "mpostactivity.preference_name";
    public static final int RESULT_CODE_FAILED = -1;
    public static final int RESULT_CODE_SUCCESS = 1;
    private String accountType;
    private final InterfaceC11824h activationCodeDialog$delegate;
    private int amount;
    public ActivityMposBinding binding;
    private final InterfaceC11824h paypad$delegate;
    private final InterfaceC11824h progressBar$delegate;
    private BroadcastReceiver responseReceiver;
    private final InterfaceC11824h statusTextView$delegate;

    /* compiled from: MPOSActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/mpos/MPOSActivity$Companion;", "", "()V", "EXTRA_ACCOUNT_TYPE", "", "EXTRA_AMOUNT", "EXTRA_CALLBACK_URL", "EXTRA_CARD_HOLDER", "EXTRA_CARD_NO", "EXTRA_RESPONSE", "EXTRA_RESPONSE_CODE", "EXTRA_RRN", "EXTRA_TERMINAL_ID", "EXTRA_TRANSACTION_ID", "PAYPAD_RESPONSE_ACTIVATION_FAILED", "PAYPAD_RESPONSE_ACTIVATION_SUCCESS", "PAYPAD_RESPONSE_ENTER_PIN", "PAYPAD_RESPONSE_INITIALIZE_COMPLETE", "PAYPAD_RESPONSE_INITIALIZE_NOT_COMPLETE", "PAYPAD_RESPONSE_INSERT_CARD", "PAYPAD_RESPONSE_START_INITIALIZATION", "PAYPAD_RESPONSE_STOP", "PAYPAD_RESPONSE_TRANSACTION_RESPONSE", "PREF_IS_ACTIVATED", "PREF_IS_INITIALIZED", "PREF_NAME", "RESULT_CODE_FAILED", "", "RESULT_CODE_SUCCESS", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
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
    public MPOSActivity() {
        InterfaceC11824h $r2;
        InterfaceC11824h $r22;
        InterfaceC11824h $r23;
        InterfaceC11824h $r24;
        MPOSActivity$statusTextView$2 $r1 = new MPOSActivity$statusTextView$2(this);
        $r2 = C13218k.m5625b($r1);
        this.statusTextView$delegate = $r2;
        MPOSActivity$progressBar$2 $r3 = new MPOSActivity$progressBar$2(this);
        $r22 = C13218k.m5625b($r3);
        this.progressBar$delegate = $r22;
        MPOSActivity$activationCodeDialog$2 $r4 = MPOSActivity$activationCodeDialog$2.INSTANCE;
        $r23 = C13218k.m5625b($r4);
        this.activationCodeDialog$delegate = $r23;
        MPOSActivity$paypad$2 $r5 = new MPOSActivity$paypad$2(this);
        $r24 = C13218k.m5625b($r5);
        this.paypad$delegate = $r24;
        this.responseReceiver = new BroadcastReceiver() { // from class: ai.kudi.agent.mpos.MPOSActivity$responseReceiver$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Log_OC.getArray(intent, "intent");
                MPOSActivity $r32 = MPOSActivity.this;
                String $r42 = intent.getStringExtra("response");
                if ($r42 != null) {
                    int $i0 = $r42.hashCode();
                    switch ($i0) {
                        case -2118244065:
                            boolean $z0 = $r42.equals("transactionresponse");
                            if ($z0) {
                                String[] $r8 = intent.getStringArrayExtra("responsearray");
                                String $r7 = $r8 == null ? null : $r8[0];
                                String $r9 = $r8 == null ? null : $r8[1];
                                String $r10 = $r8 == null ? null : $r8[2];
                                String $r11 = $r8 == null ? null : $r8[3];
                                String $r12 = $r8 == null ? null : $r8[4];
                                if ($r8 != null) {
                                    String str = $r8[5];
                                }
                                if ($r8 != null) {
                                    String $r13 = $r8[6];
                                }
                                String $r132 = $r8 == null ? null : $r8[7];
                                String $r43 = $r8 != null ? $r8[8] : null;
                                Intent $r25 = new Intent();
                                $r25.putExtra(MPOSActivity.EXTRA_RESPONSE, $r9);
                                $r25.putExtra(MPOSActivity.EXTRA_RESPONSE_CODE, $r7);
                                $r25.putExtra(MPOSActivity.EXTRA_CARD_HOLDER, $r12);
                                $r25.putExtra(MPOSActivity.EXTRA_CARD_NO, $r11);
                                $r25.putExtra(MPOSActivity.EXTRA_TERMINAL_ID, $r10);
                                $r25.putExtra(MPOSActivity.EXTRA_TRANSACTION_ID, $r132);
                                $r25.putExtra(MPOSActivity.EXTRA_RRN, $r43);
                                boolean $z02 = Log_OC.append($r7, "00");
                                if ($z02) {
                                    $r32.setResult(1, $r25);
                                } else {
                                    $r32.setResult(-1, $r25);
                                }
                                $r32.finish();
                                return;
                            }
                            return;
                        case -2105892963:
                            boolean $z03 = $r42.equals("enterPIN");
                            if ($z03) {
                                $r32.updateStatusText("Enter your Card pin in the MPOS");
                                return;
                            }
                            return;
                        case -610882285:
                            boolean $z04 = $r42.equals("failedactivation");
                            if ($z04) {
                                String $r44 = intent.getStringExtra("reason");
                                String $r72 = $r44;
                                if ($r44 == null) {
                                    $r72 = "";
                                }
                                $r32.showActivationError($r72);
                                return;
                            }
                            return;
                        case -559369348:
                            boolean $z05 = $r42.equals("initializenotcomplete");
                            if ($z05) {
                                $r32.showInitializationNotCompleted();
                                return;
                            }
                            return;
                        case 3540994:
                            boolean $z06 = $r42.equals("stop");
                            if ($z06) {
                                $r32.updateStatusText("Transaction has been cancelled. Kindly go back and re-instantiate the transaction.");
                                return;
                            }
                            return;
                        case 225978601:
                            boolean $z07 = $r42.equals("Initializecomplete");
                            if ($z07) {
                                $r32.setPaypadInitialized();
                                Paypad $r6 = $r32.getPaypad();
                                $r32.start($r6);
                                return;
                            }
                            return;
                        case 1735549740:
                            boolean $z08 = $r42.equals("activatecomplete");
                            if ($z08) {
                                RequestActivationCodeDialog $r52 = $r32.getActivationCodeDialog();
                                $r52.dismiss();
                                $r32.setPaypadActivated();
                                Paypad $r62 = $r32.getPaypad();
                                $r32.start($r62);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final SharedPreferences getPreference() {
        SharedPreferences $r1 = getSharedPreferences(PREF_NAME, 0);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestAccountType$lambda-4  reason: not valid java name */
    public static final void m39817requestAccountType$lambda4(MPOSActivity mPOSActivity, String[] strArr, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(mPOSActivity, "this$0");
        Log_OC.getArray(strArr, "$accountTypes");
        String $r0 = strArr[i];
        if ($r0 == null) {
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r4;
        }
        String $r02 = $r0.toLowerCase();
        Log_OC.loadImage($r02, "(this as java.lang.String).toLowerCase()");
        mPOSActivity.setAccountType($r02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestAccountType$lambda-5  reason: not valid java name */
    public static final void m39818requestAccountType$lambda5(MPOSActivity mPOSActivity, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(mPOSActivity, "this$0");
        mPOSActivity.sendRequestToPaypad();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void sendRequestToPaypad() {
        Intent $r1 = getIntent();
        String $r2 = getAccountType();
        if ($r2 == null) {
            boolean $z0 = $r1.hasExtra(EXTRA_ACCOUNT_TYPE);
            if (!$z0) {
                requestAccountType();
                return;
            }
            String $r22 = $r1.getStringExtra(EXTRA_ACCOUNT_TYPE);
            setAccountType($r22);
            return;
        }
        int $i0 = $r1.getIntExtra(EXTRA_AMOUNT, 1);
        setAmount($i0);
        String $r3 = $r1.getStringExtra(EXTRA_CALLBACK_URL);
        String $r23 = $r3;
        if ($r3 == null) {
            $r23 = "";
        }
        Paypad $r4 = getPaypad();
        int $i02 = getAmount();
        String $r32 = String.valueOf($i02);
        String $r5 = getAccountType();
        $r4.makePayment($r32, $r5, $r23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setPaypadActivated() {
        SharedPreferences $r1 = getPreference();
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.putBoolean(PREF_IS_ACTIVATED, true).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setPaypadInitialized() {
        SharedPreferences $r1 = getPreference();
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.putBoolean(PREF_IS_INITIALIZED, true).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showActivationError$lambda-0  reason: not valid java name */
    public static final void m39819showActivationError$lambda0(MPOSActivity mPOSActivity, DialogInterface dialogInterface) {
        Log_OC.getArray(mPOSActivity, "this$0");
        mPOSActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showActivationError$lambda-1  reason: not valid java name */
    public static final void m39820showActivationError$lambda1(MPOSActivity mPOSActivity, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(mPOSActivity, "this$0");
        mPOSActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showInitializationNotCompleted$lambda-2  reason: not valid java name */
    public static final void m39821showInitializationNotCompleted$lambda2(MPOSActivity mPOSActivity, DialogInterface dialogInterface) {
        Log_OC.getArray(mPOSActivity, "this$0");
        mPOSActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showInitializationNotCompleted$lambda-3  reason: not valid java name */
    public static final void m39822showInitializationNotCompleted$lambda3(MPOSActivity mPOSActivity, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(mPOSActivity, "this$0");
        mPOSActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(Paypad paypad) {
        boolean $z0 = paypadActivated();
        if (!$z0) {
            hideLoading();
            updateStatusText("MPOS not activated for this account.");
            requestActivationCode();
            return;
        }
        boolean $z02 = paypadInitialized();
        if ($z02) {
            paypad.connect(DeviceConnectionActivity.class);
            return;
        }
        showLoading();
        updateStatusText("MPOS is being initialized for this account.");
        paypad.initialize(DeviceConnectionActivity.class);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAccountType() {
        String r1 = this.accountType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RequestActivationCodeDialog getActivationCodeDialog() {
        InterfaceC11824h $r2 = this.activationCodeDialog$delegate;
        Object $r1 = $r2.getValue();
        RequestActivationCodeDialog $r3 = (RequestActivationCodeDialog) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getAmount() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityMposBinding getBinding() {
        ActivityMposBinding $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Paypad getPaypad() {
        InterfaceC11824h $r2 = this.paypad$delegate;
        Object $r1 = $r2.getValue();
        Paypad $r3 = (Paypad) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProgressBar getProgressBar() {
        InterfaceC11824h $r2 = this.progressBar$delegate;
        Object $r1 = $r2.getValue();
        ProgressBar $r3 = (ProgressBar) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BroadcastReceiver getResponseReceiver() {
        BroadcastReceiver r1 = this.responseReceiver;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TextView getStatusTextView() {
        InterfaceC11824h $r2 = this.statusTextView$delegate;
        Object $r1 = $r2.getValue();
        TextView $r3 = (TextView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.mpos.presentation.Contract.View
    public void hideLoading() {
        ProgressBar $r1 = getProgressBar();
        $r1.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PayPadManager $r2 = new PayPadManager(this);
        $r2.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            boolean $z0 = paypadInitialized();
            if ($z0) {
                hideLoading();
                updateStatusText("Look at the MPOS and Insert your Card.");
                sendRequestToPaypad();
                return;
            }
        }
        if (i == 2 && i2 == 10) {
            setResult(10);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater $r2 = getLayoutInflater();
        ActivityMposBinding $r3 = ActivityMposBinding.inflate($r2);
        Log_OC.loadImage($r3, "inflate(layoutInflater)");
        setBinding($r3);
        View $r4 = getBinding().getRoot();
        View r6 = $r4;
        setContentView(r6);
        Paypad $r5 = getPaypad();
        start($r5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        BroadcastReceiver $r1 = this.responseReceiver;
        unregisterReceiver($r1);
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        BroadcastReceiver $r1 = this.responseReceiver;
        IntentFilter $r2 = new IntentFilter("com.esl.paypadlib");
        registerReceiver($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean paypadActivated() {
        SharedPreferences $r1 = getPreference();
        boolean $z0 = $r1.getBoolean(PREF_IS_ACTIVATED, false);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean paypadInitialized() {
        SharedPreferences $r1 = getPreference();
        boolean $z0 = $r1.getBoolean(PREF_IS_INITIALIZED, false);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.mpos.presentation.Contract.View
    public void requestAccountType() {
        final String[] $r1 = {"Savings", "Current", "Credit"};
        DialogInterfaceC0936d.C0937a $r2 = new DialogInterfaceC0936d.C0937a(this);
        $r2.setTitle("Select Card Account Type").setSingleChoiceItems($r1, -1, new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.mpos.ProfileActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MPOSActivity $r22 = MPOSActivity.this;
                String[] $r3 = $r1;
                MPOSActivity.m39817requestAccountType$lambda4($r22, $r3, dialogInterface, i);
            }
        }).setPositiveButton("Proceed", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.mpos.FileBrowser$11
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MPOSActivity $r22 = MPOSActivity.this;
                MPOSActivity.m39818requestAccountType$lambda5($r22, dialogInterface, i);
            }
        }).show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.mpos.presentation.Contract.View
    public void requestActivationCode() {
        RequestActivationCodeDialog $r1 = getActivationCodeDialog();
        MPOSActivity$requestActivationCode$1 $r2 = new MPOSActivity$requestActivationCode$1(this);
        $r1.setSubmitListener($r2);
        RequestActivationCodeDialog $r12 = getActivationCodeDialog();
        FragmentManager $r3 = getSupportFragmentManager();
        $r12.show($r3, "UNIQUE_TAG");
    }

    public final void setAccountType(String str) {
        this.accountType = str;
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setBinding(ActivityMposBinding activityMposBinding) {
        Log_OC.getArray(activityMposBinding, "<set-?>");
        this.binding = activityMposBinding;
    }

    public final void setResponseReceiver(BroadcastReceiver broadcastReceiver) {
        Log_OC.getArray(broadcastReceiver, "<set-?>");
        this.responseReceiver = broadcastReceiver;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.mpos.presentation.Contract.View
    public void showActivationError(String str) {
        Log_OC.getArray(str, "reason");
        RequestActivationCodeDialog $r2 = getActivationCodeDialog();
        $r2.dismiss();
        DialogInterfaceC0936d.C0937a $r3 = new DialogInterfaceC0936d.C0937a(this);
        DialogInterfaceC0936d.C0937a $r32 = $r3.setTitle("Activation Failed");
        String $r1 = Log_OC.m10359a(str, (Object) " Try again later.");
        $r32.setMessage($r1).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ai.kudi.agent.mpos.InputNameDialog
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MPOSActivity $r22 = MPOSActivity.this;
                MPOSActivity.m39819showActivationError$lambda0($r22, dialogInterface);
            }
        }).setNeutralButton("Close", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.mpos.WhitelistFragment$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MPOSActivity $r22 = MPOSActivity.this;
                MPOSActivity.m39820showActivationError$lambda1($r22, dialogInterface, i);
            }
        }).show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.mpos.presentation.Contract.View
    public void showInitializationNotCompleted() {
        DialogInterfaceC0936d.C0937a $r1 = new DialogInterfaceC0936d.C0937a(this);
        $r1.setTitle("Initialization failed").setMessage("Please close this dialog and try the transaction again.").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ai.kudi.agent.mpos.SearchActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MPOSActivity $r2 = MPOSActivity.this;
                MPOSActivity.m39821showInitializationNotCompleted$lambda2($r2, dialogInterface);
            }
        }).setNeutralButton("Close", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.mpos.FileBrowser$9
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MPOSActivity $r2 = MPOSActivity.this;
                MPOSActivity.m39822showInitializationNotCompleted$lambda3($r2, dialogInterface, i);
            }
        }).show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.mpos.presentation.Contract.View
    public void showLoading() {
        ProgressBar $r1 = getProgressBar();
        $r1.setVisibility(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.mpos.presentation.Contract.View
    public void updateStatusText(String str) {
        Log_OC.getArray(str, TransactionField.STATUS);
        TextView $r2 = getStatusTextView();
        $r2.setText(str);
    }
}
