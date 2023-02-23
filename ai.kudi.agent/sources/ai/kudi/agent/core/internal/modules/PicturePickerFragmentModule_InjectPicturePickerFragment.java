package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.picture_picker.p014ui.PicturePickerFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class PicturePickerFragmentModule_InjectPicturePickerFragment {

    /* loaded from: classes.dex */
    public interface PicturePickerFragmentSubcomponent extends b<PicturePickerFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<PicturePickerFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private PicturePickerFragmentModule_InjectPicturePickerFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(PicturePickerFragmentSubcomponent.Factory factory);
}
