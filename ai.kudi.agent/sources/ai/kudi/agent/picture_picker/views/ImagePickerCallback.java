package ai.kudi.agent.picture_picker.views;

import android.graphics.Bitmap;
import kotlin.Metadata;
/* compiled from: PicturePickerCallback.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/picture_picker/views/ImagePickerCallback;", "", "onPermissionDenied", "", "permission", "", "onPictureCancelled", "onPictureTaken", "isPictureAvailable", "", "bitmap", "Landroid/graphics/Bitmap;", "onPictureUploadFailure", "onPictureUploadSuccessful", "pictureId", "pictureUrl", "onUploadStarted", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ImagePickerCallback {
    void onPermissionDenied(String str);

    void onPictureCancelled();

    void onPictureTaken(boolean z, Bitmap bitmap);

    void onPictureUploadFailure();

    void onPictureUploadSuccessful(String str, String str2, Bitmap bitmap);

    void onUploadStarted();
}
