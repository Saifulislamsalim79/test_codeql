package com.smartlook.sdk.smartlook;

import android.app.Activity;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.CrashTrackingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import com.smartlook.sdk.smartlook.core.renderingdata.annotation.WebGLRecordingMode;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class SetupOptions {
    private String smartlookAPIKey;
    private Activity activity = null;
    private boolean experimental = false;
    private WebGLRecordingMode webGLRecordingMode = null;
    private boolean adaptiveFramerateEnabled = true;
    private Integer fps = null;
    private RenderingMode renderingMode = null;
    private RenderingModeOption renderingModeOption = null;
    private boolean startNewSession = false;
    private boolean startNewSessionAndUser = false;
    private CrashTrackingMode crashTrackingMode = CrashTrackingMode.DEFAULT;
    private List<EventTrackingMode> eventTrackingModes = new ArrayList();

    public SetupOptions(String str) {
        this.smartlookAPIKey = str;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public CrashTrackingMode getCrashTrackingMode() {
        return this.crashTrackingMode;
    }

    public List<EventTrackingMode> getEventTrackingModes() {
        return this.eventTrackingModes;
    }

    public Integer getFps() {
        return this.fps;
    }

    public RenderingMode getRenderingMode() {
        return this.renderingMode;
    }

    public RenderingModeOption getRenderingModeOption() {
        return this.renderingModeOption;
    }

    public String getSmartlookAPIKey() {
        return this.smartlookAPIKey;
    }

    public WebGLRecordingMode getWebGLRecordingMode() {
        return this.webGLRecordingMode;
    }

    public boolean isAdaptiveFramerateEnabled() {
        return this.adaptiveFramerateEnabled;
    }

    public boolean isExperimental() {
        return this.experimental;
    }

    public boolean isStartNewSession() {
        return this.startNewSession;
    }

    public boolean isStartNewSessionAndUser() {
        return this.startNewSessionAndUser;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setAdaptiveFramerateEnabled(boolean z) {
        this.adaptiveFramerateEnabled = z;
    }

    public void setCrashTrackingMode(CrashTrackingMode crashTrackingMode) {
        this.crashTrackingMode = crashTrackingMode;
    }

    public void setEventTrackingModes(List<EventTrackingMode> list) {
        this.eventTrackingModes = list;
    }

    public void setExperimental(boolean z) {
        this.experimental = z;
    }

    public void setFps(Integer num) {
        this.fps = num;
    }

    public void setRenderingMode(RenderingMode renderingMode) {
        this.renderingMode = renderingMode;
    }

    public void setRenderingModeOption(RenderingModeOption renderingModeOption) {
        this.renderingModeOption = renderingModeOption;
    }

    public void setStartNewSession(boolean z) {
        this.startNewSession = z;
    }

    public void setStartNewSessionAndUser(boolean z) {
        this.startNewSessionAndUser = z;
    }

    public void setWebGLRecordingMode(WebGLRecordingMode webGLRecordingMode) {
        this.webGLRecordingMode = webGLRecordingMode;
    }
}
