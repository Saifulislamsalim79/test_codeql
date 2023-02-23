package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.RatingDialog;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectRatingDialog {

    /* loaded from: classes.dex */
    public interface RatingDialogSubcomponent extends b<RatingDialog> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<RatingDialog> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectRatingDialog() {
    }

    abstract b$a bindAndroidInjectorFactory(RatingDialogSubcomponent.Factory factory);
}
