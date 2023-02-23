package ai.kudi.agent.settings.account.xpp3;

import ai.kudi.agent.settings.account.p025ui.activity.BankAccountActivity;
import ai.kudi.agent.settings.account.p025ui.fragment.AddBankAccountFragment;
import ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragment;
import kotlin.Metadata;
/* compiled from: BankAccountSubcomponent.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/settings/account/di/BankAccountSubcomponent;", "", "inject", "", "bankAccountActivity", "Lai/kudi/agent/settings/account/ui/activity/BankAccountActivity;", "addBankAccountFragment", "Lai/kudi/agent/settings/account/ui/fragment/AddBankAccountFragment;", "Lai/kudi/agent/settings/account/ui/fragment/BankAccountFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface BankAccountSubcomponent {

    /* compiled from: BankAccountSubcomponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/settings/account/di/BankAccountSubcomponent$Factory;", "", "create", "Lai/kudi/agent/settings/account/di/BankAccountSubcomponent;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        BankAccountSubcomponent create();
    }

    void inject(BankAccountActivity bankAccountActivity);

    void inject(AddBankAccountFragment addBankAccountFragment);

    void inject(BankAccountFragment bankAccountFragment);
}
