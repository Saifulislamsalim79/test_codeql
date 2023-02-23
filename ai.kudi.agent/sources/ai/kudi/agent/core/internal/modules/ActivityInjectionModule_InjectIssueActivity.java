package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueActivity;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ActivityInjectionModule_InjectIssueActivity {

    /* loaded from: classes.dex */
    public interface IssueActivitySubcomponent extends b<IssueActivity> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueActivity> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ActivityInjectionModule_InjectIssueActivity() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueActivitySubcomponent.Factory factory);
}
