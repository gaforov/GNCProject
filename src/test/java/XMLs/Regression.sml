


<suite name ="suite1" parallel = "tests" thread-count="3">

<!--    <test name = "firefox">-->

<!--        <parameter name="browser" value = "firefox"/>-->
<!--        <classes>-->
<!--            <class name="runners.ParallelRunner"/>-->

<!--        </classes>-->
<!--    </test>-->

        <test name = "chrome">
            <parameter name="browser" value = "chrome"/>
            <classes>
                <class name="runners.ParallelRunner" />

            </classes>
        </test>

<!--        <test name = "edge">-->
<!--            <parameter name="browser" value = "edge"/>-->
<!--            <classes>-->
<!--                <class name="runners.ParallelRunner"/>-->

<!--            </classes>-->
<!--        </test>-->
</suite>