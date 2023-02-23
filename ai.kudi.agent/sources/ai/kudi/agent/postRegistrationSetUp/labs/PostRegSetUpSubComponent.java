package ai.kudi.agent.postRegistrationSetUp.labs;

import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.postRegistrationSetUp.fragments.UpgradeAccountFragmentSetUp;
import ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragment;
import kotlin.Metadata;
/* compiled from: PostRegSetUpSubComponent.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/di/PostRegSetUpSubComponent;", "", "inject", "", "postRegistrationActivity", "Lai/kudi/agent/postRegistrationSetUp/PostRegistrationActivity;", "upgradeAccountFragmentSetUp", "Lai/kudi/agent/postRegistrationSetUp/fragments/UpgradeAccountFragmentSetUp;", "bankAccountFragment", "Lai/kudi/agent/settings/account/ui/fragment/BankAccountFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PostRegSetUpSubComponent {

    /* compiled from: PostRegSetUpSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/di/PostRegSetUpSubComponent$Factory;", "", "create", "Lai/kudi/agent/postRegistrationSetUp/di/PostRegSetUpSubComponent;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        PostRegSetUpSubComponent create();
    }

    void inject(PostRegistrationActivity postRegistrationActivity);

    void inject(UpgradeAccountFragmentSetUp upgradeAccountFragmentSetUp);

    void inject(BankAccountFragment bankAccountFragment);
}
