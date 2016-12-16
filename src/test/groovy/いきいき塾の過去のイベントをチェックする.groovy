import geb.spock.GebReportingSpec

class いきいき塾の過去のイベントをチェックする extends GebReportingSpec {

    def "最初のイベントは、『「はじめよう！要件定義」ではじめる、すらすらと手が動くようになる楽々要件定義レッスン』"() {
        given: "いきいき塾のページに遷移する"
        go "https://rd-lesson.doorkeeper.jp/"

        when: "過去のイベントをクリックして"
        $('a', href: "/events/past", text: '過去のイベント').click()

        and: "最後のページに遷移して"
        $('a', text: '最後').click()

        and: "一番最初のイベントの内容を確認すると"
        def eventName = $(".client-event-listing-event > div > h3 > a > span").last().text()

        then:
        eventName == "「はじめよう！要件定義」ではじめる、すらすらと手が動くようになる楽々要件定義レッスン"
    }
}