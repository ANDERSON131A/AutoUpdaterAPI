package com.gamerking195.dev.autoupdaterapi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateLocale {
    //Variables with NoVar at the end mean they don't support variables.

    //File & plugin name, for instance if set to CoolPlugin there will be a CoolPlugin.jar and AutoUpdaterAPI will try to enable a plugin called "CoolPlugin".
    private String fileName = "plugin";
    private String updating = "&f&lUPDATING &1&l%plugin% &b&lV%old_version% &a&l» &b&l%new_version%";
    private String updatingNoVar = "&f&lUPDATING PLUGIN...";
    private String updatingDownload = "&f&lUPDATING &1&l%plugin% &b&lV%old_version% &a&l» &b&l%new_version% &8| %download_bar% &8| &a%download_percent%";
    private String updateComplete = "&f&lUPDATED &1&l%plugin% &f&lTO &b&lV%new_version%";
    private String updateFailed = "&f&lUPDATING &1&l%plugin% &b&lV%old_version% &a&l» &b&l%new_version% &8[&c&lUPDATE FAILED &7&o(Check Console)]";
    private String updateFailedNoVar = "&c&lUPDATE FAILED &7(Check Console)";
}
