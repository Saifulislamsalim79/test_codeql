package com.smartlook.sdk.smartlook;

import android.app.Activity;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.CrashTrackingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import com.smartlook.sdk.smartlook.core.renderingdata.annotation.WebGLRecordingMode;
import com.smartlook.sdk.smartlook.integration.model.Integration;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import e.a.a.a.f.a0.c;
import java.util.List;
/* loaded from: classes2.dex */
public class Smartlook extends SmartlookBase {

    /* renamed from: b */
    public static final e.a.a.a.c.d.a f17138b = e.a.a.a.c.h.a.u();

    /* loaded from: classes2.dex */
    public static class SetupOptionsBuilder {
        public SetupOptions options;

        public SetupOptionsBuilder(String str) {
            this.options = new SetupOptions(str);
        }

        public SetupOptions build() {
            return this.options;
        }

        public SetupOptionsBuilder enableWebGLRecording(WebGLRecordingMode webGLRecordingMode) {
            this.options.setWebGLRecordingMode(webGLRecordingMode);
            return this;
        }

        public SetupOptionsBuilder setActivity(Activity activity) {
            this.options.setActivity(activity);
            return this;
        }

        public SetupOptionsBuilder setCrashTrackingMode(CrashTrackingMode crashTrackingMode) {
            this.options.setCrashTrackingMode(crashTrackingMode);
            return this;
        }

        public SetupOptionsBuilder setEventTrackingModes(List<EventTrackingMode> list) {
            this.options.setEventTrackingModes(list);
            return this;
        }

        public SetupOptionsBuilder setExperimental(boolean z) {
            this.options.setExperimental(z);
            return this;
        }

        public SetupOptionsBuilder setFps(int i) {
            this.options.setFps(Integer.valueOf(i));
            return this;
        }

        public SetupOptionsBuilder setRenderingMode(RenderingMode renderingMode) {
            this.options.setRenderingMode(renderingMode);
            return this;
        }

        public SetupOptionsBuilder setRenderingModeOption(RenderingModeOption renderingModeOption) {
            this.options.setRenderingModeOption(renderingModeOption);
            return this;
        }

        public SetupOptionsBuilder startNewSession() {
            this.options.setStartNewSession(true);
            return this;
        }

        public SetupOptionsBuilder startNewSessionAndUser() {
            this.options.setStartNewSessionAndUser(true);
            return this;
        }

        public SetupOptionsBuilder useAdaptiveFramerate(boolean z) {
            this.options.setAdaptiveFramerateEnabled(z);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19303a(Integration integration) {
        return "disableIntegration() called with: integration = " + e.a.a.a.f.a0.a.a(integration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19302b(Integration integration) {
        return "enableIntegration() called with: integration = " + e.a.a.a.f.a0.a.a(integration);
    }

    public static List<Integration> currentEnabledIntegrations() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "NativeAPI", C7241f.f17174a);
        return f17138b.F();
    }

    public static void disableAllIntegrations() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "NativeAPI", C7211a.f17142a);
        f17138b.r0();
    }

    public static void disableIntegration(final Integration integration) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "NativeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.e
            /* renamed from: a */
            public final String m19087a() {
                String m19303a;
                m19303a = Smartlook.m19303a(Integration.this);
                return m19303a;
            }
        });
        f17138b.t(integration);
    }

    public static void disableIntegrations(final List<Integration> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "NativeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.b
            /* renamed from: a */
            public final String m19104a() {
                String m19301h;
                m19301h = Smartlook.m19301h(list);
                return m19301h;
            }
        });
        f17138b.R(list);
    }

    public static void enableIntegration(final Integration integration) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "NativeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.d
            /* renamed from: a */
            public final String m19091a() {
                String m19302b;
                m19302b = Smartlook.m19302b(Integration.this);
                return m19302b;
            }
        });
        f17138b.J(integration);
    }

    public static void enableIntegrations(final List<Integration> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "NativeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.c
            /* renamed from: a */
            public final String m19100a() {
                String m19300i;
                m19300i = Smartlook.m19300i(list);
                return m19300i;
            }
        });
        f17138b.d0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m19301h(List list) {
        return "disableIntegrations() called with: integrations = " + e.a.a.a.f.a0.a.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ String m19300i(List list) {
        return "enableIntegrations() called with: integrations = " + e.a.a.a.f.a0.a.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ String m19299l() {
        return "currentEnabledIntegrations() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ String m19298m() {
        return "disableAllIntegrations() called";
    }
}
