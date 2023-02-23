package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.KYCformIssueFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectKYCformIssueFragment {

    /* loaded from: classes.dex */
    public interface KYCformIssueFragmentSubcomponent extends b<KYCformIssueFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KYCformIssueFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectKYCformIssueFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KYCformIssueFragmentSubcomponent.Factory factory);
}
