package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.ContactUsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectContactUsFragment {

    /* loaded from: classes.dex */
    public interface ContactUsFragmentSubcomponent extends b<ContactUsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<ContactUsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectContactUsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(ContactUsFragmentSubcomponent.Factory factory);
}
