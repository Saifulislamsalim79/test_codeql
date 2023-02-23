package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.CustomerDetailsIssueFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectCustomerDetailsIssueFragment {

    /* loaded from: classes.dex */
    public interface CustomerDetailsIssueFragmentSubcomponent extends b<CustomerDetailsIssueFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<CustomerDetailsIssueFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectCustomerDetailsIssueFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(CustomerDetailsIssueFragmentSubcomponent.Factory factory);
}
