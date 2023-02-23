package ai.kudi.agent.start.intro;

import ai.kudi.agent.BaseAppCompactActivity;
import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.databinding.ActivityOnBoardingV2Binding;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.start.intro.adapter.IntroAdapter;
import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OnBoardingActivity.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/start/intro/OnBoardingActivity;", "Lai/kudi/agent/BaseAppCompactActivity;", "()V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "binding", "Lai/kudi/agent/databinding/ActivityOnBoardingV2Binding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityOnBoardingV2Binding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityOnBoardingV2Binding;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setIndicatorActive", "position", "", "setUpViewPager", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OnBoardingActivity extends BaseAppCompactActivity {
    public Analytics analytics;
    public ActivityOnBoardingV2Binding binding;
    public SmartLookAnalytics smartLookAnalytics;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40944onCreate$lambda0(OnBoardingActivity onBoardingActivity, View view) {
        Log_OC.getArray(onBoardingActivity, "this$0");
        Analytics $r1 = onBoardingActivity.getAnalytics();
        $r1.onGetStartedClicked();
        Intent $r3 = new Intent(onBoardingActivity, RegisterActivity.class);
        onBoardingActivity.startActivity($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setIndicatorActive(int i) {
        ActivityOnBoardingV2Binding $r1 = getBinding();
        if (i == 0) {
            View $r2 = $r1.view5;
            Drawable $r3 = C1335a.m36322f(this, C0001R.C0002drawable.circle_deep_blue);
            $r2.setBackground($r3);
            View $r22 = $r1.view6;
            Drawable $r32 = C1335a.m36322f(this, C0001R.C0002drawable.circle_bordered_blue);
            $r22.setBackground($r32);
            View $r23 = $r1.view7;
            Drawable $r33 = C1335a.m36322f(this, C0001R.C0002drawable.circle_bordered_blue);
            $r23.setBackground($r33);
        } else if (i == 1) {
            View $r24 = $r1.view5;
            Drawable $r34 = C1335a.m36322f(this, C0001R.C0002drawable.circle_bordered_blue);
            $r24.setBackground($r34);
            View $r25 = $r1.view6;
            Drawable $r35 = C1335a.m36322f(this, C0001R.C0002drawable.circle_deep_blue);
            $r25.setBackground($r35);
            View $r26 = $r1.view7;
            Drawable $r36 = C1335a.m36322f(this, C0001R.C0002drawable.circle_bordered_blue);
            $r26.setBackground($r36);
        } else if (i != 2) {
        } else {
            View $r27 = $r1.view5;
            Drawable $r37 = C1335a.m36322f(this, C0001R.C0002drawable.circle_bordered_blue);
            $r27.setBackground($r37);
            View $r28 = $r1.view6;
            Drawable $r38 = C1335a.m36322f(this, C0001R.C0002drawable.circle_bordered_blue);
            $r28.setBackground($r38);
            View $r29 = $r1.view7;
            Drawable $r39 = C1335a.m36322f(this, C0001R.C0002drawable.circle_deep_blue);
            $r29.setBackground($r39);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpViewPager() {
        ActivityOnBoardingV2Binding $r1 = getBinding();
        ViewPager $r2 = $r1.viewPager;
        FragmentManager $r4 = getSupportFragmentManager();
        Log_OC.loadImage($r4, "supportFragmentManager");
        IntroAdapter $r3 = new IntroAdapter($r4, 1);
        $r2.setAdapter($r3);
        $r2.addOnPageChangeListener(new ViewPager.InterfaceC1898j() { // from class: ai.kudi.agent.start.intro.OnBoardingActivity$setUpViewPager$1$1
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageScrollStateChanged(int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageScrolled(int i, float f, int i2) {
                OnBoardingActivity $r12 = OnBoardingActivity.this;
                $r12.setIndicatorActive(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageSelected(int i) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityOnBoardingV2Binding getBinding() {
        ActivityOnBoardingV2Binding $r1 = this.binding;
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
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.BaseAppCompactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r13 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r13;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        LayoutInflater $r5 = getLayoutInflater();
        ActivityOnBoardingV2Binding $r6 = ActivityOnBoardingV2Binding.inflate($r5);
        Log_OC.loadImage($r6, "inflate(layoutInflater)");
        setBinding($r6);
        View $r7 = getBinding().getRoot();
        View r14 = $r7;
        setContentView(r14);
        setUpViewPager();
        SmartLookAnalytics $r8 = getSmartLookAnalytics();
        $r8.logOnboarding();
        ViewGroup $r9 = getBinding().getStartedButton;
        ViewGroup r15 = $r9;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.start.intro.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnBoardingActivity $r22 = OnBoardingActivity.this;
                OnBoardingActivity.m40944onCreate$lambda0($r22, view);
            }
        });
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setBinding(ActivityOnBoardingV2Binding activityOnBoardingV2Binding) {
        Log_OC.getArray(activityOnBoardingV2Binding, "<set-?>");
        this.binding = activityOnBoardingV2Binding;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }
}
