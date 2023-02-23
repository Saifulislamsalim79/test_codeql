package tcking.github.com.giraffeplayer2;

import android.content.res.Configuration;
/* compiled from: BasePlayerActivity.java */
/* renamed from: tcking.github.com.giraffeplayer2.b */
/* loaded from: classes3.dex */
public abstract class AbstractC14856b extends androidx.appcompat.app.e {
    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (C14894j.m92g().m84o()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C14894j.m92g().m83p(configuration);
    }
}
