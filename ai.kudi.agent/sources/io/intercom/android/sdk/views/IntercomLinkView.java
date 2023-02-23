package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* loaded from: classes3.dex */
public class IntercomLinkView extends AppCompatTextView {
    private static final int INTERCOM_LINK_ANIMATION_TIME_MS = 100;
    private final int conversationBottomPaddingPx;
    private final int[] intercomLinkPosition;
    private int lastBottomPosition;
    private final int[] lastChildPosition;
    private final Twig twig;

    public IntercomLinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastChildPosition = new int[2];
        this.intercomLinkPosition = new int[2];
        this.lastBottomPosition = 0;
        this.twig = LumberMill.getLogger();
        this.conversationBottomPaddingPx = ScreenUtils.dpToPx(8.0f, getContext());
    }

    private String getCompanyForUrl(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            this.twig.m13065i("Could not url encode the app name", new Object[0]);
            return "";
        }
    }

    String createIntercomLinkUrl(Provider<AppConfig> provider, boolean z, String str, String str2, String str3) {
        String str4 = z ? "4+home-screen+we-run-on-intercom" : "4+conversation+we-run-on-intercom";
        return "https://www.intercom.io/intercom-link?user_id=" + str2 + "&powered_by_app_id=" + str + "&company=" + getCompanyForUrl(provider.get().getName()) + "&solution=" + str3 + "&utm_source=android-sdk&utm_campaign=intercom-link&utm_content=" + str4 + "&utm_medium=messenger";
    }

    public void followIntercomLink(Provider<AppConfig> provider, Api api, boolean z, String str, String str2, String str3) {
        LinkOpener.handleUrl(createIntercomLinkUrl(provider, z, str, str2, str3), getContext(), api);
    }

    public void hide() {
        animate().alpha(0.0f).setDuration(100L);
        setClickable(false);
    }

    public void hideIfIntersectedOrShow(View view) {
        view.getLocationOnScreen(this.lastChildPosition);
        int height = this.lastChildPosition[1] + view.getHeight() + this.conversationBottomPaddingPx;
        getLocationOnScreen(this.intercomLinkPosition);
        int[] iArr = this.intercomLinkPosition;
        if (height >= iArr[1] && this.lastBottomPosition < iArr[1]) {
            hide();
        } else {
            int[] iArr2 = this.intercomLinkPosition;
            if (height < iArr2[1] && this.lastBottomPosition >= iArr2[1]) {
                show();
            }
        }
        this.lastBottomPosition = height;
    }

    public void show() {
        animate().alpha(1.0f).setDuration(100L);
        setClickable(true);
    }
}
