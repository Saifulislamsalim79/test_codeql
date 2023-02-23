package ai.kudi.agent.core.util.image;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.ScaleImageUtil;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.widget.ImageView;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10770t;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ImageScale.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/core/util/image/ImageScale;", "", "()V", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class ImageScale {
    public static final Companion Companion;

    /* compiled from: ImageScale.kt */
    @Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/core/util/image/ImageScale$Companion;", "", "()V", "getImageFilePath", "", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "context", "Landroid/content/Context;", "imageOrientationValidator", "Landroid/graphics/Bitmap;", "bitmap", "path", "scaleDownFile", "currentFilePath", "imageFile", "Ljava/io/File;", "setPicture", "", "profilePictureImageView", "Landroid/widget/ImageView;", "currentPhotoPath", "defaultImageSize", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final Bitmap imageOrientationValidator(Bitmap bitmap, String str) {
            Bitmap $r5;
            try {
                ExifInterface $r3 = new ExifInterface(str);
                int $i0 = $r3.getAttributeInt("Orientation", 1);
                if ($i0 == 3) {
                    Bitmap $r4 = C10770t.m12370k(bitmap, 180);
                    $r5 = $r4;
                    Log_OC.loadImage($r4, "rotateImage(bitmap, 180)");
                } else if ($i0 == 6) {
                    Bitmap $r42 = C10770t.m12370k(bitmap, 90);
                    $r5 = $r42;
                    Log_OC.loadImage($r42, "rotateImage(bitmap, 90)");
                } else if ($i0 != 8) {
                    return bitmap;
                } else {
                    Bitmap $r43 = C10770t.m12370k(bitmap, 270);
                    $r5 = $r43;
                    Log_OC.loadImage($r43, "rotateImage(bitmap, 270)");
                }
                return $r5;
            } catch (IOException $r6) {
                $r6.printStackTrace();
                return bitmap;
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ String scaleDownFile$default(Companion companion, String str, File $r3, int i, Object obj) {
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r3 = null;
            }
            String $r0 = companion.scaleDownFile(str, $r3);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ void setPicture$default(Companion companion, ImageView imageView, String str, int $i0, int i, Object obj) {
            int $i1 = i & 4;
            if ($i1 != 0) {
                $i0 = 200;
            }
            companion.setPicture(imageView, str, $i0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getImageFilePath(Intent intent, Context context) {
            Log_OC.getArray(intent, TransactionBreakDownItemType.DATA);
            Log_OC.getArray(context, "context");
            Uri $r3 = intent.getData();
            Log_OC.append($r3);
            Log_OC.loadImage($r3, "data.data!!");
            ContentResolver $r4 = context.getContentResolver();
            Cursor $r5 = $r4.query($r3, null, null, null, null);
            if ($r5 == null) {
                String $r6 = $r3.getPath();
                return $r6;
            }
            $r5.moveToFirst();
            int $i0 = $r5.getColumnIndex("_data");
            String $r62 = $r5.getString($i0);
            $r5.close();
            return $r62;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String scaleDownFile(String str, File file) {
            FileOutputStream $r8;
            Log_OC.getArray(str, "currentFilePath");
            ScaleImageUtil.Companion $r3 = ScaleImageUtil.Companion;
            Bitmap $r4 = $r3.convertFileToBitmap(str);
            if ($r4 != null) {
                ScaleImageUtil.Companion $r32 = ScaleImageUtil.Companion;
                Bitmap $r42 = ScaleImageUtil.Companion.getScaledBitmap$default($r32, $r4, 0, 2, null);
                ByteArrayOutputStream $r5 = new ByteArrayOutputStream();
                if ($r42 != null) {
                    Bitmap.CompressFormat $r6 = Bitmap.CompressFormat.JPEG;
                    $r42.compress($r6, 75, $r5);
                }
                byte[] $r7 = $r5.toByteArray();
                try {
                    $r8 = new FileOutputStream(file);
                } catch (Exception $r9) {
                    $r9.printStackTrace();
                    $r8 = null;
                }
                if ($r8 != null) {
                    $r8.write($r7);
                    $r8.flush();
                    $r8.close();
                }
            }
            if (file == null) {
                return null;
            }
            String $r2 = file.getAbsolutePath();
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void setPicture(ImageView imageView, String str, int $i0) {
            Log_OC.getArray(imageView, "profilePictureImageView");
            Log_OC.getArray(str, "currentPhotoPath");
            try {
                int $i1 = imageView.getWidth();
                int $i12 = $i1 == 0 ? $i0 : imageView.getWidth();
                int $i2 = imageView.getHeight();
                if ($i2 != 0) {
                    $i0 = imageView.getHeight();
                }
                BitmapFactory.Options $r3 = new BitmapFactory.Options();
                $r3.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, $r3);
                int $i3 = $r3.outWidth;
                int $i22 = $r3.outHeight;
                int $i02 = Math.max($i3 / $i12, $i22 / $i0);
                $r3.inJustDecodeBounds = false;
                $r3.inSampleSize = $i02;
                Bitmap $r4 = BitmapFactory.decodeFile(str, $r3);
                Log_OC.loadImage($r4, "bitmap");
                imageView.setImageBitmap(imageOrientationValidator($r4, str));
            } catch (Exception $r5) {
                CrashlyticsReport.logException($r5);
                $r5.printStackTrace();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }
}
