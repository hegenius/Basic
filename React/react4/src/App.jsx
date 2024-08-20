import Info from "./components/Info.jsx";
import CounterUseEffect from "./components/CounterUseEffect.jsx";
import LifecylceClass from "./components/LifecylceClass.jsx";
import LifecylceFunc from "./components/LifecylceFunc.jsx";
import VolumeControl from "./components/VolumeControl.jsx";
import HookUseMemo from "./components/HookUseMemo.jsx";
import HookUseMemo2 from "./components/HookUseMemo2.jsx";
import HookUseRef from "./components/HookUseRef.jsx";
import Accommodate from "./components/Accommodate.jsx";

function App() {
    return (
        <div className={'container mt-5'}>
            <h3>useState 여러개 사용</h3>
            <Info/>

            <br/>
            <hr/>
            <br/>

            <h3>useEffect 사용하기</h3>
            {/*<CounterUseEffect/>*/}
            <br/>
            <LifecylceClass/>
            <br/>
            <LifecylceFunc/>
            <br/>
            <hr/>
            <br/>

            <h3>문제 1) useState, useEffect 로 볼륨 조절기 만들기</h3>
            <VolumeControl/>

            <br/>
            <hr/>
            <br/>

            <h3>useMemo 사용하기</h3>
            <HookUseMemo/>
            <HookUseMemo2/>
            <br/>
            <hr/>
            <br/>

            <h3>useRef 사용하기</h3>
            <HookUseRef/>
                <br/><br/>

            <Accommodate/>
            <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
        </div>
    );
}

export default App
