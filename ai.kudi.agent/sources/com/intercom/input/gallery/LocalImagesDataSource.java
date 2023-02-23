package com.intercom.input.gallery;

import ai.kudi.agent.pin.KudiPin;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.fragment.app.i;
import com.intercom.input.gallery.GalleryImage;
import com.intercom.input.gallery.GalleryInputDataSource;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class LocalImagesDataSource implements GalleryInputDataSource {
    private static final int ITEM_COUNT_LIMIT = 50;
    private static final int READ_EXTERNAL_STORAGE_REQUEST = 1;
    private Context context;
    private GalleryInputScreen galleryInputScreen;
    private GalleryInputDataSource.Listener listener;
    private boolean loading;
    private PermissionHelper permissionHelper;

    LocalImagesDataSource(Context context, PermissionHelper permissionHelper, GalleryInputScreen galleryInputScreen) {
        this.context = context;
        this.galleryInputScreen = galleryInputScreen;
        this.permissionHelper = permissionHelper;
    }

    public static GalleryInputDataSource create(GalleryInputFragment galleryInputFragment) {
        i activity = galleryInputFragment.getActivity();
        return new LocalImagesDataSource(activity, PermissionHelper.create(activity), galleryInputFragment);
    }

    private Point getImageHeightAndWidth(Cursor cursor, String str) {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 16) {
            i = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
            i2 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i3 = options.outWidth;
            i = options.outHeight;
            i2 = i3;
        }
        return new Point(i2, i);
    }

    List<GalleryImage> galleryImagesFromCursor(Cursor cursor) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        if (cursor.moveToFirst()) {
            do {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
                String string3 = cursor.getString(cursor.getColumnIndexOrThrow(KudiPin.KUDI_PIN_TITLE));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow("_size"));
                if (string != null && string3 != null && string2 != null) {
                    Point imageHeightAndWidth = getImageHeightAndWidth(cursor, string);
                    arrayList.add(new GalleryImage.Builder().withFileName(string3).withPath(string).withMimeType(string2).withImageWidth(imageHeightAndWidth.x).withImageHeight(imageHeightAndWidth.y).withFileSize(i).build());
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        }
        cursor.close();
        return arrayList;
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public int getCount() {
        Cursor query;
        if (getPermissionStatus() == 0 && (query = this.context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, null)) != null) {
            int count = query.getCount();
            query.close();
            return count;
        }
        return 0;
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public void getImages(int i, String str) {
        this.loading = true;
        String[] strArr = Build.VERSION.SDK_INT >= 16 ? new String[]{"_data", "date_added", "mime_type", KudiPin.KUDI_PIN_TITLE, "height", "width", "_size"} : new String[]{"_data", "date_added", "mime_type", KudiPin.KUDI_PIN_TITLE, "_size"};
        ContentResolver contentResolver = this.context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor query = contentResolver.query(uri, strArr, null, null, "date_added DESC LIMIT 50 OFFSET " + i);
        this.loading = false;
        if (query == null) {
            this.listener.onError();
        } else {
            this.listener.onSuccess(galleryImagesFromCursor(query));
        }
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public int getPermissionStatus() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.permissionHelper.getPermissionStatus("android.permission.READ_EXTERNAL_STORAGE");
        }
        return 0;
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public boolean isLoading() {
        return this.loading;
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public void requestPermission() {
        this.permissionHelper.setAskedForPermissionPref(true);
        if (Build.VERSION.SDK_INT >= 23) {
            this.galleryInputScreen.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        }
    }

    @Override // com.intercom.input.gallery.GalleryInputDataSource
    public void setListener(GalleryInputDataSource.Listener listener) {
        this.listener = listener;
    }
}
