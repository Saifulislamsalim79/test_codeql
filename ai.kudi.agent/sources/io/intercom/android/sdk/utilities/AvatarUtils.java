package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.transforms.RoundTransform;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import io.intercom.android.sdk.views.AvatarInitialsDrawable;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10783c;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10867f;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d;
import java.io.File;
/* loaded from: classes3.dex */
public class AvatarUtils {
    public static void createAvatar(Avatar avatar, ImageView imageView, int i, AppConfig appConfig, C10486i c10486i) {
        Drawable initialsDrawable;
        Context context = imageView.getContext();
        if (avatar.getInitials().isEmpty()) {
            initialsDrawable = getDefaultDrawable(context, appConfig);
        } else {
            initialsDrawable = getInitialsDrawable(avatar.getInitials(), appConfig);
        }
        C10856g m12133l0 = new C10856g().m12153a0(initialsDrawable).m12135k(initialsDrawable).m12144f(ImageUtils.getDiskCacheStrategy(avatar.getImageUrl())).m12133l0(new RoundTransform());
        if (i > 0) {
            m12133l0 = m12133l0.m12156X(i, i);
        }
        C10483h<Drawable> m12977i = c10486i.m12977i(avatar.getImageUrl());
        m12977i.m12986u(C10783c.m12343h());
        m12977i.m13004b(m12133l0);
        m12977i.m12994l(imageView);
    }

    public static AvatarDefaultDrawable getDefaultDrawable(Context context, AppConfig appConfig) {
        return new AvatarDefaultDrawable(context, appConfig.getSecondaryColorDark());
    }

    public static AvatarInitialsDrawable getInitialsDrawable(String str, AppConfig appConfig) {
        return new AvatarInitialsDrawable(str.toUpperCase(), appConfig.getSecondaryColorDark());
    }

    public static void loadAvatarIntoView(Avatar avatar, ImageView imageView, AppConfig appConfig, C10486i c10486i) {
        createAvatar(avatar, imageView, 0, appConfig, c10486i);
    }

    public static void preloadAvatar(Avatar avatar, final Runnable runnable, C10486i c10486i) {
        if (avatar.getImageUrl().isEmpty()) {
            runnable.run();
            return;
        }
        C10483h<File> m12980f = c10486i.m12980f();
        m12980f.m12990q(avatar.getImageUrl());
        m12980f.m12997i(new AbstractC10867f<File>() { // from class: io.intercom.android.sdk.utilities.AvatarUtils.1
            @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
            public void onLoadFailed(Drawable drawable) {
                runnable.run();
            }

            @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, InterfaceC10878d interfaceC10878d) {
                onResourceReady((File) obj, (InterfaceC10878d<? super File>) interfaceC10878d);
            }

            public void onResourceReady(File file, InterfaceC10878d<? super File> interfaceC10878d) {
                runnable.run();
            }
        });
    }
}
