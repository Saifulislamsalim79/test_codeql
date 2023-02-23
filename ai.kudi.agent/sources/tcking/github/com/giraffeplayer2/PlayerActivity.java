package tcking.github.com.giraffeplayer2;

import android.content.Intent;
import android.os.Bundle;
import p272h.p275b.p283c.p284a.C8231b;
import p272h.p275b.p283c.p284a.C8232c;
/* loaded from: classes3.dex */
public class PlayerActivity extends AbstractC14856b {
    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        setContentView(C8232c.giraffe_player_activity);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        C14906p c14906p = (C14906p) intent.getParcelableExtra("__video_info__");
        if (c14906p == null) {
            finish();
            return;
        }
        if (c14906p.m27l()) {
            setRequestedOrientation(6);
        }
        C14894j.m92g().m81r(c14906p.m35d());
        VideoView videoView = (VideoView) findViewById(C8231b.video_view);
        videoView.m202e(c14906p);
        C14894j.m92g().m90i(videoView).start();
    }
}
