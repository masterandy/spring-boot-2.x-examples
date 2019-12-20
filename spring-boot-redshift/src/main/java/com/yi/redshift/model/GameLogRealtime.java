package com.yi.redshift.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 实时数据表
 *
 * @author YI 2019-12-20
 */
@Data
public class GameLogRealtime implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * open_id
     */
    private String openId;

    /**
     * account_type
     */
    private Integer accountType;

    /**
     * platform_id
     */
    private Integer platformId;

    /**
     * store_name
     */
    private String storeName;

    /**
     * channel_id
     */
    private Integer channelId;

    /**
     * app_id
     */
    private Integer appId;

    /**
     * server_id
     */
    private Integer serverId;

    /**
     * brand
     */
    private String brand;

    /**
     * isp
     */
    private String isp;

    /**
     * event_id
     */
    private Integer eventId;

    /**
     * event_time_client
     */
    private Integer eventTimeClient;

    /**
     * signature
     */
    private String signature;

    /**
     * os
     */
    private Integer os;

    /**
     * ua
     */
    private String ua;

    /**
     * orientation
     */
    private Integer orientation;

    /**
     * ssid
     */
    private String ssid;

    /**
     * bssid
     */
    private String bssid;

    /**
     * sdk_version
     */
    private String sdkVersion;

    /**
     * boot_time
     */
    private String bootTime;

    /**
     * network_info
     */
    private String networkInfo;

    /**
     * os_version
     */
    private String osVersion;

    /**
     * model
     */
    private String model;

    /**
     * device_name
     */
    private String deviceName;

    /**
     * language
     */
    private String language;

    /**
     * screen_height
     */
    private Integer screenHeight;

    /**
     * screen_width
     */
    private Integer screenWidth;

    /**
     * pkg_name
     */
    private String pkgName;

    /**
     * app_name
     */
    private String appName;

    /**
     * mac
     */
    private String mac;

    /**
     * android_id
     */
    private String androidId;

    /**
     * android_imei1
     */
    private String androidImei1;

    /**
     * android_imei2
     */
    private String androidImei2;

    /**
     * android_imsi1
     */
    private String androidImsi1;

    /**
     * android_imsi2
     */
    private String androidImsi2;

    /**
     * android_sdsize
     */
    private String androidSdsize;

    /**
     * android_romsize
     */
    private String androidRomsize;

    /**
     * android_ramsize
     */
    private String androidRamsize;

    /**
     * android_cpu
     */
    private String androidCpu;

    /**
     * android_mah
     */
    private String androidMah;

    /**
     * android_densitydpi
     */
    private String androidDensitydpi;

    /**
     * android_density
     */
    private String androidDensity;

    /**
     * android_version_name
     */
    private String androidVersionName;

    /**
     * android_version_code
     */
    private Integer androidVersionCode;

    /**
     * ios_idfa
     */
    private String iosIdfa;

    /**
     * ios_idfv
     */
    private String iosIdfv;

    /**
     * ios_app_version
     */
    private String iosAppVersion;

    /**
     * ios_app_build
     */
    private String iosAppBuild;

    /**
     * event_time_server
     */
    private Integer eventTimeServer;

    /**
     * cp_open_id
     */
    private String cpOpenId;

    /**
     * app_register_time
     */
    private String appRegisterTime;

    /**
     * account_register_app_id
     */
    private String accountRegisterAppId;

    /**
     * account_register_time
     */
    private Integer accountRegisterTime;

    /**
     * country
     */
    private String country;

    /**
     * province
     */
    private String province;

    /**
     * city
     */
    private String city;

    /**
     * event_date_server
     */
    private Date eventDateServer;

    /**
     * iap_id
     */
    private String iapId;

    /**
     * real_currency_amount
     */
    private Integer realCurrencyAmount;

    /**
     * real_currency_type
     */
    private String realCurrencyType;

    /**
     * order_id
     */
    private String orderId;

    /**
     * payment_type
     */
    private String paymentType;

    /**
     * recharge_virtual_currency_amount
     */
    private Integer rechargeVirtualCurrencyAmount;

    /**
     * device_id
     */
    private String deviceId;

    /**
     * role_id
     */
    private String roleId;

    /**
     * role_level
     */
    private Integer roleLevel;

    /**
     * vip_level
     */
    private Integer vipLevel;

    /**
     * recharge_currency_balance
     */
    private Integer rechargeCurrencyBalance;

    /**
     * free_currency_balance
     */
    private Integer freeCurrencyBalance;

    /**
     * party_id
     */
    private Integer partyId;

    /**
     * session_duration
     */
    private Integer sessionDuration;

    /**
     * et
     */
    private String et;

    /**
     * project_id
     */
    private Integer projectId;

    /**
     * register_time
     */
    private Date registerTime;

    /**
     * time_from_previous
     */
    private Integer timeFromPrevious;

    /**
     * role_name
     */
    private String roleName;

    /**
     * role_create_time
     */
    private String roleCreateTime;

    /**
     * vip_remain
     */
    private Integer vipRemain;

    /**
     * svip_remain
     */
    private Integer svipRemain;

    /**
     * history_recharge
     */
    private Integer historyRecharge;

    /**
     * user_ip
     */
    private String userIp;

    /**
     * account_name
     */
    private String accountName;

    /**
     * task_id
     */
    private Integer taskId;

    /**
     * task_name
     */
    private String taskName;

    /**
     * role_create_date
     */
    private String roleCreateDate;

    /**
     * svip_level
     */
    private Integer svipLevel;

    /**
     * step_id
     */
    private Integer stepId;

    /**
     * step_name
     */
    private String stepName;

    /**
     * step_used_time
     */
    private Integer stepUsedTime;

    /**
     * skill_action
     */
    private Integer skillAction;

    /**
     * skill_id
     */
    private Integer skillId;

    /**
     * skill_times
     */
    private Integer skillTimes;

    /**
     * player_type
     */
    private Integer playerType;

    /**
     * game_id
     */
    private String gameId;

    /**
     * start_time
     */
    private Integer startTime;

    /**
     * end_time
     */
    private Integer endTime;

    /**
     * game_type
     */
    private String gameType;

    /**
     * time_domain
     */
    private String timeDomain;

    /**
     * device_app_register_time
     */
    private Integer deviceAppRegisterTime;

    /**
     * device_app_register_date
     */
    private String deviceAppRegisterDate;

    /**
     * add_time
     */
    private String addTime;

    /**
     * pay_time
     */
    private String payTime;

    /**
     * is_test
     */
    private Integer isTest;

    /**
     * cp_order_id
     */
    private String cpOrderId;

    /**
     * platform_order_id
     */
    private String platformOrderId;

    /**
     * extra_params
     */
    private String extraParams;

    /**
     * vip_type
     */
    private Integer vipType;

    /**
     * currency_balance_info
     */
    private String currencyBalanceInfo;

    /**
     * crash_log
     */
    private String crashLog;

    /**
     * error_log
     */
    private String errorLog;

    /**
     * operation_id
     */
    private Integer operationId;

    /**
     * operation_name
     */
    private String operationName;

    /**
     * costomize_ad_vertising
     */
    private String costomizeAdVertising;

    /**
     * costomize_style
     */
    private String costomizeStyle;

    /**
     * costomize_ad_position_id
     */
    private String costomizeAdPositionId;

    /**
     * other_game_id
     */
    private String otherGameId;

    /**
     * other_game_name
     */
    private String otherGameName;

    /**
     * aid
     */
    private Integer aid;

    /**
     * advertiser_id
     */
    private Integer advertiserId;

    /**
     * mid
     */
    private Integer mid;

    /**
     * special_offer_name
     */
    private String specialOfferName;

    /**
     * special_offer_id
     */
    private String specialOfferId;

    /**
     * special_offer_price
     */
    private Integer specialOfferPrice;

    /**
     * pay_channel
     */
    private String payChannel;

    /**
     * special_offer_show
     */
    private Integer specialOfferShow;

    /**
     * sign_continuous_days
     */
    private Integer signContinuousDays;

    /**
     * sign_reward_type
     */
    private String signRewardType;

    /**
     * sign_reward_num
     */
    private Integer signRewardNum;

    /**
     * step_status
     */
    private Integer stepStatus;

    /**
     * step_type
     */
    private Integer stepType;

    /**
     * share_point_id
     */
    private Integer sharePointId;

    /**
     * upper_open_id
     */
    private String upperOpenId;

    /**
     * video_point_id
     */
    private Integer videoPointId;

    /**
     * currency_type
     */
    private Integer currencyType;

    /**
     * change_type
     */
    private Integer changeType;

    /**
     * currency_change_reason
     */
    private String currencyChangeReason;

    /**
     * currency_count
     */
    private Integer currencyCount;

    /**
     * currency_balance
     */
    private Integer currencyBalance;

    /**
     * items_id
     */
    private Integer itemsId;

    /**
     * items_num
     */
    private Integer itemsNum;

    /**
     * distributor_id
     */
    private Integer distributorId;

    /**
     * wx_software_version
     */
    private String wxSoftwareVersion;

    /**
     * wx_sdk_version
     */
    private String wxSdkVersion;

    /**
     * wx_benchmark_level
     */
    private Integer wxBenchmarkLevel;

    /**
     * to_app_name
     */
    private String toAppName;

    /**
     * wechat_open_id
     */
    private String wechatOpenId;

    /**
     * from_app_name
     */
    private String fromAppName;

    /**
     * task_used_time
     */
    private String taskUsedTime;

    /**
     * task_status
     */
    private String taskStatus;

    /**
     * task_type
     */
    private String taskType;

    /**
     * page_id
     */
    private String pageId;

    /**
     * page_loading_time
     */
    private Integer pageLoadingTime;

    /**
     * register_channel_id
     */
    private Integer registerChannelId;

    /**
     * register_device_id
     */
    private String registerDeviceId;

    /**
     * register_device_app_register_time
     */
    private Integer registerDeviceAppRegisterTime;

    /**
     * export_point
     */
    private Integer exportPoint;

    /**
     * upper_register_time
     */
    private Integer upperRegisterTime;

    /**
     * from_share_point_id
     */
    private Integer fromSharePointId;

    /**
     * reason
     */
    private String reason;

    /**
     * progress_id
     */
    private Integer progressId;

    /**
     * progress_name
     */
    private String progressName;

    /**
     * progress_time
     */
    private Integer progressTime;

    /**
     * dt
     */
    private Date dt;

    /**
     * dt_time
     */
    private String dtTime;

    public GameLogRealtime() {
    }
}
