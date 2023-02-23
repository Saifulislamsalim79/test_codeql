package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.product.p019ui.ProductActivity;
import ai.kudi.agent.savings.p024ui.SavingsActivity;
import kotlin.Metadata;
/* compiled from: ActivityInjectionModule.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/ActivityInjectionModule;", "", "()V", "injectAirtimeTopUpFragment", "Lai/kudi/agent/product/ui/ProductActivity;", "injectHomeActivity", "Lai/kudi/agent/home/HomeActivity;", "injectIssueActivity", "Lai/kudi/agent/issues/ui/IssueActivity;", "injectKshockActivity", "Lai/kudi/agent/kshock/ui/KShockActivity;", "injectSavingsActivity", "Lai/kudi/agent/savings/ui/SavingsActivity;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class ActivityInjectionModule {
    public abstract ProductActivity injectAirtimeTopUpFragment();

    public abstract HomeActivity injectHomeActivity();

    public abstract IssueActivity injectIssueActivity();

    public abstract KShockActivity injectKshockActivity();

    public abstract SavingsActivity injectSavingsActivity();
}
