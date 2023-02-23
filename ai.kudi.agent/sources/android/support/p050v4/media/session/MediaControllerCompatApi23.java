package android.support.p050v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
/* renamed from: android.support.v4.media.session.MediaControllerCompatApi23 */
/* loaded from: classes2.dex */
class MediaControllerCompatApi23 {

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi23$TransportControls */
    /* loaded from: classes2.dex */
    public static class TransportControls {
        private TransportControls() {
        }

        public static void playFromUri(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromUri(uri, bundle);
        }
    }

    private MediaControllerCompatApi23() {
    }
}
