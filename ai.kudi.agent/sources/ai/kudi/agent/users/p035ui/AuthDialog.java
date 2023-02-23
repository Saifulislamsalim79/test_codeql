package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ViewUsersAuthDialogBinding;
import ai.kudi.agent.network.util.ConnectivityUtil;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.usecases.Authorize;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.p035ui.AuthDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.textfield.TextInputEditText;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.HttpException;
/* compiled from: AuthDialog.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010#\u001a\u00020\u000eJ\u0010\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&J\u001e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R$\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006."}, m10421d2 = {"Lai/kudi/agent/users/ui/AuthDialog;", "", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "authorize", "Lai/kudi/agent/users/domain/usecases/Authorize;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/Authorize;Lai/kudi/agent/core/analytics/Analytics;)V", "dialog", "Lai/kudi/agent/users/ui/AuthDialog$Dialog;", "dismissListener", "Lkotlin/Function1;", "", "", "getDismissListener", "()Lkotlin/jvm/functions/Function1;", "setDismissListener", "(Lkotlin/jvm/functions/Function1;)V", "isAuthorized", "()Z", "setAuthorized", "(Z)V", "onSuccessfulAuth", "", "getOnSuccessfulAuth", "setOnSuccessfulAuth", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "()V", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "dismiss", "handleError", "throwable", "", "show", "fm", "Landroidx/fragment/app/FragmentManager;", "deviceId", "deviceName", "Companion", "Dialog", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.users.ui.AuthDialog */
/* loaded from: classes.dex */
public final class AuthDialog {
    public static final Companion Companion;
    public static final String INNER_DIALOG_TAG = ".AuthDialog.Dialog";
    private final Analytics analytics;
    private final Authorize authorize;
    private final FetchCurrentUser currentUser;
    private final Dialog dialog;
    private InterfaceC11767l<? super Boolean, C13666w> dismissListener;
    private boolean isAuthorized;
    private InterfaceC11767l<? super String, C13666w> onSuccessfulAuth;
    public SharedPreferences sharedPreferences;

    /* compiled from: AuthDialog.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/users/ui/AuthDialog$Companion;", "", "()V", "INNER_DIALOG_TAG", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.users.ui.AuthDialog$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: AuthDialog.kt */
    @Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\b\u0010\u0019\u001a\u00020\u000bH\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020)J\u0010\u0010'\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0012J\u0006\u0010+\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/users/ui/AuthDialog$Dialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lai/kudi/agent/databinding/ViewUsersAuthDialogBinding;", "getBinding", "()Lai/kudi/agent/databinding/ViewUsersAuthDialogBinding;", "setBinding", "(Lai/kudi/agent/databinding/ViewUsersAuthDialogBinding;)V", "dismissListener", "Lkotlin/Function0;", "", "getDismissListener", "()Lkotlin/jvm/functions/Function0;", "setDismissListener", "(Lkotlin/jvm/functions/Function0;)V", "onAuthorize", "Lkotlin/Function1;", "", "getOnAuthorize", "()Lkotlin/jvm/functions/Function1;", "setOnAuthorize", "(Lkotlin/jvm/functions/Function1;)V", "hideErrorMessage", "hideLoading", "onAuthorizeClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "showErrorMessage", "resMessage", "", MetricTracker.Object.MESSAGE, "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.users.ui.AuthDialog$Dialog */
    /* loaded from: classes.dex */
    public static final class Dialog extends Chapter {
        private ViewUsersAuthDialogBinding binding;
        private InterfaceC11756a<C13666w> dismissListener;
        private InterfaceC11767l<? super String, C13666w> onAuthorize;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void onAuthorizeClicked() {
            TextInputEditText $r3;
            ViewUsersAuthDialogBinding $r1 = this.binding;
            Editable $r2 = null;
            if ($r1 != null && ($r3 = $r1.passwordEditText) != null) {
                $r2 = $r3.getText();
            }
            String $r4 = String.valueOf($r2);
            hideErrorMessage();
            InterfaceC11767l $r5 = this.onAuthorize;
            if ($r5 == null) {
                return;
            }
            $r5.invoke($r4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
        public static final void m41467onViewCreated$lambda0(Dialog dialog, View view) {
            Log_OC.getArray(dialog, "this$0");
            dialog.onAuthorizeClicked();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void showErrorMessage$default(Dialog dialog, int $i0, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $i0 = C0001R.string.something_went_wrong;
            }
            dialog.showErrorMessage($i0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ViewUsersAuthDialogBinding getBinding() {
            ViewUsersAuthDialogBinding r1 = this.binding;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final InterfaceC11756a getDismissListener() {
            InterfaceC11756a r1 = this.dismissListener;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final InterfaceC11767l getOnAuthorize() {
            InterfaceC11767l r1 = this.onAuthorize;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void hideErrorMessage() {
            ViewUsersAuthDialogBinding $r1 = this.binding;
            TextView $r2 = $r1 == null ? null : $r1.errorTextView;
            if ($r2 == null) {
                return;
            }
            $r2.setText("");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void hideLoading() {
            ProgressBar $r3;
            Button $r2;
            ViewUsersAuthDialogBinding $r1 = this.binding;
            if ($r1 != null && ($r2 = $r1.authorizeButton) != null) {
                ViewExtKt.show($r2);
            }
            ViewUsersAuthDialogBinding $r12 = this.binding;
            if ($r12 == null || ($r3 = $r12.loadingProgressBar) == null) {
                return;
            }
            ViewExtKt.hide$default($r3, false, 1, null);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            Log_OC.getArray(layoutInflater, "inflater");
            ViewUsersAuthDialogBinding $r4 = ViewUsersAuthDialogBinding.inflate(layoutInflater, viewGroup, false);
            this.binding = $r4;
            if ($r4 == null) {
                return null;
            }
            LinearLayout $r5 = $r4.getRoot();
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.fragment.app.Chapter, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Log_OC.getArray(dialogInterface, "dialog");
            super.onDismiss(dialogInterface);
            InterfaceC11756a $r2 = this.dismissListener;
            if ($r2 == null) {
                return;
            }
            $r2.invoke();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            Button $r4;
            Log_OC.getArray(view, "view");
            super.onViewCreated(view, bundle);
            ViewUsersAuthDialogBinding $r3 = this.binding;
            if ($r3 == null || ($r4 = $r3.authorizeButton) == null) {
                return;
            }
            $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.users.ui.AboutFragment$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AuthDialog.Dialog $r2 = AuthDialog.Dialog.this;
                    AuthDialog.Dialog.m41467onViewCreated$lambda0($r2, view2);
                }
            });
        }

        public final void setBinding(ViewUsersAuthDialogBinding viewUsersAuthDialogBinding) {
            this.binding = viewUsersAuthDialogBinding;
        }

        public final void setDismissListener(InterfaceC11756a interfaceC11756a) {
            this.dismissListener = interfaceC11756a;
        }

        public final void setOnAuthorize(InterfaceC11767l interfaceC11767l) {
            this.onAuthorize = interfaceC11767l;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void showErrorMessage(int i) {
            ViewUsersAuthDialogBinding $r1 = this.binding;
            TextView $r3 = $r1 == null ? null : $r1.errorTextView;
            if ($r3 == null) {
                return;
            }
            Context $r4 = getContext();
            CharSequence $r2 = $r4 != null ? $r4.getText(i) : null;
            $r3.setText($r2);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void showErrorMessage(String str) {
            ViewUsersAuthDialogBinding $r2 = this.binding;
            TextView $r3 = $r2 == null ? null : $r2.errorTextView;
            if ($r3 == null) {
                return;
            }
            $r3.setText(str);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void showLoading() {
            ProgressBar $r3;
            Button $r2;
            ViewUsersAuthDialogBinding $r1 = this.binding;
            if ($r1 != null && ($r2 = $r1.authorizeButton) != null) {
                ViewExtKt.hide$default($r2, false, 1, null);
            }
            ViewUsersAuthDialogBinding $r12 = this.binding;
            if ($r12 == null || ($r3 = $r12.loadingProgressBar) == null) {
                return;
            }
            ViewExtKt.show($r3);
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
    public AuthDialog(FetchCurrentUser fetchCurrentUser, Authorize authorize, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(authorize, "authorize");
        Log_OC.getArray(analytics, "analytics");
        this.currentUser = fetchCurrentUser;
        this.authorize = authorize;
        this.analytics = analytics;
        Dialog $r4 = new Dialog();
        this.dialog = $r4;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void dismiss() {
        Dialog $r1 = this.dialog;
        if ($r1 == null) {
            return;
        }
        $r1.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getDismissListener() {
        InterfaceC11767l r1 = this.dismissListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnSuccessfulAuth() {
        InterfaceC11767l r1 = this.onSuccessfulAuth;
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
    public final void handleError(Throwable th) {
        Dialog $r2 = this.dialog;
        if ($r2 != null) {
            $r2.hideLoading();
        }
        if (th != null) {
            boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
            if (!$z0) {
                boolean $z02 = th instanceof HttpException;
                if (!$z02) {
                    Dialog $r22 = this.dialog;
                    if ($r22 == null) {
                        return;
                    }
                    Dialog.showErrorMessage$default($r22, 0, 1, null);
                    return;
                }
                HttpException $r3 = (HttpException) th;
                int $i0 = $r3.m352a();
                if ($i0 == 403) {
                    Dialog $r23 = this.dialog;
                    if ($r23 == null) {
                        return;
                    }
                    Dialog.showErrorMessage$default($r23, 0, 1, null);
                    return;
                } else if ($i0 != 409) {
                    Dialog $r24 = this.dialog;
                    if ($r24 == null) {
                        return;
                    }
                    Dialog.showErrorMessage$default($r24, 0, 1, null);
                    return;
                } else {
                    InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
                    Object $r5 = $r4.invoke(th);
                    String $r6 = (String) $r5;
                    Dialog $r25 = this.dialog;
                    if ($r25 == null) {
                        return;
                    }
                    $r25.showErrorMessage($r6);
                    return;
                }
            }
        }
        Dialog $r26 = this.dialog;
        if ($r26 == null) {
            return;
        }
        $r26.showErrorMessage(C0001R.string.something_went_wrong);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isAuthorized() {
        boolean z0 = this.isAuthorized;
        return z0;
    }

    public final void setAuthorized(boolean z) {
        this.isAuthorized = z;
    }

    public final void setDismissListener(InterfaceC11767l interfaceC11767l) {
        this.dismissListener = interfaceC11767l;
    }

    public final void setOnSuccessfulAuth(InterfaceC11767l interfaceC11767l) {
        this.onSuccessfulAuth = interfaceC11767l;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void show(FragmentManager fragmentManager, String str, String str2) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(str, "deviceId");
        Log_OC.getArray(str2, "deviceName");
        C11812w $r6 = new C11812w();
        Dialog $r2 = this.dialog;
        if ($r2 != null) {
            AuthDialog$show$1 $r3 = new AuthDialog$show$1(this, $r6, str, str2);
            $r2.setOnAuthorize($r3);
        }
        Dialog $r22 = this.dialog;
        if ($r22 != null) {
            AuthDialog$show$2 $r7 = new AuthDialog$show$2(this);
            $r22.setDismissListener($r7);
        }
        Dialog $r23 = this.dialog;
        if ($r23 == null) {
            return;
        }
        $r23.show(fragmentManager, ".AuthDialog.Dialog");
    }
}
