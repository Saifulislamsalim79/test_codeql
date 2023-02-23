package ai.kudi.agent.postRegistrationSetUp;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityPostRegistrationBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.postRegistrationSetUp.fragments.PosSetUpFragment;
import ai.kudi.agent.postRegistrationSetUp.fragments.UpgradeAccountFragmentSetUp;
import ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent;
import ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragment;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PostRegistrationActivity.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0014\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0019J\u0012\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020$R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/PostRegistrationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityPostRegistrationBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityPostRegistrationBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityPostRegistrationBinding;)V", "postRegSetUpSubComponent", "Lai/kudi/agent/postRegistrationSetUp/di/PostRegSetUpSubComponent;", "getPostRegSetUpSubComponent", "()Lai/kudi/agent/postRegistrationSetUp/di/PostRegSetUpSubComponent;", "setPostRegSetUpSubComponent", "(Lai/kudi/agent/postRegistrationSetUp/di/PostRegSetUpSubComponent;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setActionButtonClickListener", "action", "Lkotlin/Function0;", "setButtonText", AttributeType.TEXT, "", "setSubtitle", "subtitle", "setTitle", KudiPin.KUDI_PIN_TITLE, "setToolBarIconColor", "iconColor", "", "setUpTitleBar", "toggleActionButton", "isVisible", "", "toggleButtonVisibility", "visible", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PostRegistrationActivity extends AppCompatActivity {
    public ActivityPostRegistrationBinding binding;
    public PostRegSetUpSubComponent postRegSetUpSubComponent;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40136onCreate$lambda0(PostRegistrationActivity postRegistrationActivity, View view) {
        Log_OC.getArray(postRegistrationActivity, "this$0");
        postRegistrationActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setActionButtonClickListener$lambda-4  reason: not valid java name */
    public static final void m40137setActionButtonClickListener$lambda4(InterfaceC11756a interfaceC11756a, View view) {
        Log_OC.getArray(interfaceC11756a, "$action");
        interfaceC11756a.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setToolBarIconColor(int i) {
        Drawable $r1 = ContextExtKt.getKudiDrawable(this, C0001R.C0002drawable.ic_arrow_backward);
        if ($r1 != null) {
            ContextExtKt.setKudiColorFilter($r1, this, i);
        }
        ActivityPostRegistrationBinding $r2 = getBinding();
        Toolbar $r3 = $r2.postRegToolBar;
        $r3.setNavigationIcon($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpTitleBar() {
        Intent $r1 = getIntent();
        boolean $z0 = $r1.hasExtra(TodoConstantsKt.FROM_SETTINGS);
        if ($z0) {
            Intent $r12 = getIntent();
            boolean $z02 = $r12.getBooleanExtra(TodoConstantsKt.FROM_SETTINGS, false);
            if ($z02) {
                ActivityPostRegistrationBinding $r2 = getBinding();
                View $r3 = $r2.appBarLayout;
                Log_OC.loadImage($r3, "appBarLayout");
                View r8 = $r3;
                ViewExtKt.show(r8);
                TextView $r4 = $r2.postRegTitleView;
                Log_OC.loadImage($r4, "postRegTitleView");
                ViewExtKt.hide$default($r4, false, 1, null);
                setToolBarIconColor(C0001R.color.blackDatePickerTextColor);
                Toolbar $r5 = $r2.postRegToolBar;
                $r5.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.postRegistrationSetUp.b
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PostRegistrationActivity $r22 = PostRegistrationActivity.this;
                        PostRegistrationActivity.m40138setUpTitleBar$lambda2$lambda1($r22, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpTitleBar$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40138setUpTitleBar$lambda2$lambda1(PostRegistrationActivity postRegistrationActivity, View view) {
        Log_OC.getArray(postRegistrationActivity, "this$0");
        postRegistrationActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityPostRegistrationBinding getBinding() {
        ActivityPostRegistrationBinding $r1 = this.binding;
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
    public final PostRegSetUpSubComponent getPostRegSetUpSubComponent() {
        PostRegSetUpSubComponent $r1 = this.postRegSetUpSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("postRegSetUpSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r17 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r17;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        PostRegSetUpSubComponent.Factory $r5 = $r4.postRegistrationSubComponent();
        PostRegSetUpSubComponent $r6 = $r5.create();
        setPostRegSetUpSubComponent($r6);
        super.onCreate(bundle);
        PostRegSetUpSubComponent $r62 = getPostRegSetUpSubComponent();
        $r62.inject(this);
        LayoutInflater $r7 = getLayoutInflater();
        ActivityPostRegistrationBinding $r8 = ActivityPostRegistrationBinding.inflate($r7);
        Log_OC.loadImage($r8, "inflate(layoutInflater)");
        setBinding($r8);
        ScrollView $r9 = getBinding().getRoot();
        setContentView($r9);
        TextView $r10 = getBinding().postRegSkipButton;
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.postRegistrationSetUp.ActivityMain$18
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostRegistrationActivity $r22 = PostRegistrationActivity.this;
                PostRegistrationActivity.m40136onCreate$lambda0($r22, view);
            }
        });
        Intent $r12 = getIntent();
        boolean $z0 = $r12.hasExtra(TodoConstantsKt.TODO_SELECTED);
        if ($z0) {
            Intent $r122 = getIntent();
            String $r13 = $r122.getStringExtra(TodoConstantsKt.TODO_SELECTED);
            if ($r13 != null) {
                int $i0 = $r13.hashCode();
                if ($i0 == -985280378) {
                    boolean $z02 = $r13.equals(TodoConstantsKt.POS_TODO);
                    if ($z02) {
                        PosSetUpFragment $r16 = new PosSetUpFragment();
                        AppCompatActivityExtKt.startFragment$default(this, $r16, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
                    }
                } else if ($i0 == -110221741) {
                    boolean $z03 = $r13.equals(TodoConstantsKt.UPGRADE_ACCT_TODO);
                    if ($z03) {
                        setUpTitleBar();
                        UpgradeAccountFragmentSetUp $r15 = new UpgradeAccountFragmentSetUp();
                        AppCompatActivityExtKt.startFragment$default(this, $r15, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
                    }
                } else if ($i0 != 1291613888) {
                } else {
                    boolean $z04 = $r13.equals(TodoConstantsKt.BANK_ACCT_TODO);
                    if ($z04) {
                        BankAccountFragment $r14 = new BankAccountFragment();
                        AppCompatActivityExtKt.startFragment$default(this, $r14, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setActionButtonClickListener(final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11756a, "action");
        ActivityPostRegistrationBinding $r3 = getBinding();
        ViewGroup $r4 = $r3.postRegActionButton;
        ViewGroup r6 = $r4;
        r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.postRegistrationSetUp.ItemClickListener
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC11756a $r2 = InterfaceC11756a.this;
                PostRegistrationActivity.m40137setActionButtonClickListener$lambda4($r2, view);
            }
        });
    }

    public final void setBinding(ActivityPostRegistrationBinding activityPostRegistrationBinding) {
        Log_OC.getArray(activityPostRegistrationBinding, "<set-?>");
        this.binding = activityPostRegistrationBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setButtonText(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        ActivityPostRegistrationBinding $r2 = getBinding();
        KudiButton $r3 = $r2.postRegActionButton;
        $r3.setText(str);
    }

    public final void setPostRegSetUpSubComponent(PostRegSetUpSubComponent postRegSetUpSubComponent) {
        Log_OC.getArray(postRegSetUpSubComponent, "<set-?>");
        this.postRegSetUpSubComponent = postRegSetUpSubComponent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setSubtitle(String str) {
        Log_OC.getArray(str, "subtitle");
        ActivityPostRegistrationBinding $r2 = getBinding();
        TextView $r3 = $r2.postRegSubtitleView;
        $r3.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setTitle(String str) {
        Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
        ActivityPostRegistrationBinding $r2 = getBinding();
        TextView $r3 = $r2.postRegTitleView;
        $r3.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleActionButton(boolean z) {
        if (!z) {
            ActivityPostRegistrationBinding $r1 = getBinding();
            $r1.postRegActionButton.m38033e();
            return;
        }
        ActivityPostRegistrationBinding $r12 = getBinding();
        View $r2 = $r12.postRegActionButton;
        Log_OC.loadImage($r2, "binding.postRegActionButton");
        View r3 = $r2;
        ViewExtKt.show(r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleButtonVisibility(boolean z) {
        ActivityPostRegistrationBinding $r1 = getBinding();
        View $r2 = $r1.postRegActionButton;
        Log_OC.loadImage($r2, "");
        if (z) {
            View r3 = $r2;
            ViewExtKt.show(r3);
            return;
        }
        View r32 = $r2;
        ViewExtKt.hide$default(r32, false, 1, null);
    }
}
