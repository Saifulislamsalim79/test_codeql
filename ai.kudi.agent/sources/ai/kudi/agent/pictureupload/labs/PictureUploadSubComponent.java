package ai.kudi.agent.pictureupload.labs;

import ai.kudi.agent.pictureupload.p015ui.PictureUploadFragment;
import ai.kudi.agent.register.navigators.ImageSelectorNavigator;
import kotlin.Metadata;
/* compiled from: PictureUploadSubComponent.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/pictureupload/di/PictureUploadSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/pictureupload/ui/PictureUploadFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PictureUploadSubComponent {

    /* compiled from: PictureUploadSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/pictureupload/di/PictureUploadSubComponent$Factory;", "", "create", "Lai/kudi/agent/pictureupload/di/PictureUploadSubComponent;", "navigator", "Lai/kudi/agent/register/navigators/ImageSelectorNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        PictureUploadSubComponent create(ImageSelectorNavigator imageSelectorNavigator);
    }

    void inject(PictureUploadFragment pictureUploadFragment);
}
