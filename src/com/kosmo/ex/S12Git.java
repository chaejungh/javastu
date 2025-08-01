package com.kosmo.ex;

public class S12Git {
    /*

---

# ✅ Git 핵심 개념 정리

## 1. 🔧 Git 저장소 및 커밋 관련

| 개념          | 설명                 | 대표 명령어                |
| ----------- | ------------------ | --------------------- |
| Git 저장소 초기화 | 디렉토리를 Git 저장소로 만들기 | `git init`            |
| 커밋          | 변경 사항을 로컬 저장소에 기록  | `git commit -m "메시지"` |
| 스테이징        | 커밋할 파일을 준비하는 과정    | `git add <파일명>`       |
| 상태 확인       | 파일 변경 및 스테이징 여부 확인 | `git status`          |

### 커밋 전 과정 요약

```
작업 디렉토리 → (git add) → 스테이징 영역 → (git commit) → 로컬 저장소
```

---

## 2. 🌿 브랜치 관련

| 개념          | 설명                     | 대표 명령어                   |
| ----------- | ---------------------- | ------------------------ |
| 브랜치 생성 및 이동 | 새 브랜치 생성과 동시에 이동       | `git checkout -b <브랜치명>` |
| 브랜치 간 병합    | 현재 브랜치에 다른 브랜치의 변경을 병합 | `git merge <브랜치명>`       |
| 현재 브랜치 확인   | 현재 작업 중인 브랜치           | `git branch`             |

---

## 3. 📍 HEAD와 checkout

| 개념            | 설명                                |
| ------------- | --------------------------------- |
| HEAD          | 현재 checkout된 커밋이나 브랜치를 가리키는 포인터   |
| detached HEAD | 브랜치가 아닌 커밋 자체를 checkout할 때 생기는 상태 |
| checkout      | 브랜치나 특정 커밋으로 작업 디렉토리를 변경하는 명령     |

| 대표 명령어                   | 의미                         |
| ------------------------ | -------------------------- |
| `git checkout <커밋해시>`    | 해당 커밋으로 이동 (detached HEAD) |
| `git checkout -b <브랜치명>` | 브랜치 생성 및 이동                |

---

## 4. ♻️ reset

| 옵션              | 설명                       | 영향                          |
| --------------- | ------------------------ | --------------------------- |
| `--soft`        | 커밋만 되돌림, 스테이징 상태는 유지     | O: staging 유지<br>X: 작업 디렉토리 |
| `--mixed` (기본값) | 커밋과 스테이징 제거, 작업 디렉토리 유지  | X: staging<br>O: 작업 디렉토리    |
| `--hard`        | 커밋, 스테이징, 작업 디렉토리 모두 되돌림 | 모든 변경 사항 삭제 (복구 어려움)        |

| 예시                        | 설명                          |
| ------------------------- | --------------------------- |
| `git reset --soft HEAD~1` | 마지막 커밋을 취소하고 파일은 그대로 스테이징   |
| `git reset --hard`        | 변경 내용 포함 모두 삭제하고 되돌림        |
| `git reset <파일명>`         | 스테이징된 특정 파일만 해제 (변경 내용은 남음) |

---

## 5. 🌐 리모트 저장소 관련

| 개념          | 설명                     | 명령어                           |
| ----------- | ---------------------- | ----------------------------- |
| 원격 저장소 등록   | 원격 주소(alias) 등록        | `git remote add origin <URL>` |
| 원격 저장소에 올리기 | 로컬 → 리모트로 푸시           | `git push origin main`        |
| 원격 저장소 복제   | 원격 저장소 전체 복제           | `git clone <URL>`             |
| fetch       | 원격 저장소의 변경 사항을 받아오기만 함 | `git fetch`                   |
| pull        | fetch + merge를 한 번에 수행 | `git pull`                    |
| 원격 브랜치 보기   | 리모트 브랜치 목록 조회          | `git branch -r`               |

---

## 💡 종합 요약

| 구분     | 명령어                                            | 핵심 기능                |
| ------ | ---------------------------------------------- | -------------------- |
| 저장소 생성 | `git init`                                     | 로컬 저장소 초기화           |
| 파일 추적  | `git add`                                      | 스테이징 영역에 파일 추가       |
| 변경 기록  | `git commit`                                   | 로컬 저장소에 커밋 생성        |
| 브랜치 관리 | `git branch`, `git checkout`, `git merge`      | 브랜치 생성, 전환, 병합       |
| 리셋     | `git reset` (soft/mixed/hard)                  | 커밋/스테이징/작업 디렉토리 되돌리기 |
| HEAD   | `HEAD`, `HEAD~1`, `checkout <커밋>`              | 현재 위치 포인터 제어         |
| 리모트 연동 | `git remote`, `push`, `pull`, `fetch`, `clone` | 원격 저장소와 연결 및 동기화     |

---


---

## ✅ Git 이론 문제 (선택형, 10문제)

---

### 🔹 문제 1

로컬에서 새로운 Git 저장소를 만들기 위한 명령어는?

A. `git start`
B. `git begin`
C. `git init`
D. `git new`


---

### 🔹 문제 2

`git commit` 명령어의 주된 목적은 무엇인가?

A. 저장소를 복사한다
B. 변경 내용을 staging에 올린다
C. 변경 내용을 로컬 저장소에 기록한다
D. 브랜치를 병합한다

---

### 🔹 문제 3

다음 중 새 브랜치를 만들고 그 브랜치로 이동하는 명령어는?

A. `git branch feature`
B. `git checkout feature`
C. `git checkout -b feature`
D. `git switch feature`


---

### 🔹 문제 4

브랜치 병합 시 사용되는 명령어는?

A. `git push`
B. `git combine`
C. `git join`
D. `git merge`


---

### 🔹 문제 5

로컬 저장소에서 리모트 저장소를 연결할 때 사용하는 명령어는?

A. `git set-remote`
B. `git add remote`
C. `git remote add`
D. `git connect`

---

### 🔹 문제 6

`git push origin main` 명령어의 의미로 옳은 것은?

A. 로컬 브랜치를 삭제한다
B. 로컬 main 브랜치를 origin 리모트에 업로드한다
C. origin에서 main 브랜치를 가져온다
D. main 브랜치를 병합한다


---

### 🔹 문제 7

기존 원격 저장소를 복제하여 로컬 저장소로 만드는 명령어는?

A. `git fork`
B. `git pull`
C. `git init`
D. `git clone`


---

### 🔹 문제 8

다음 중 `fetch` 후에 반드시 해줘야 하는 작업은?

A. 브랜치 생성
B. 병합 또는 리베이스
C. 스테이징
D. 커밋 리셋


---

### 🔹 문제 9

`git pull`의 동작 방식으로 옳은 것은?

A. 로컬 변경을 삭제하고 원격과 동기화
B. `fetch`와 `merge`를 한 번에 수행
C. 리모트 저장소를 초기화
D. 커밋을 제거하고 다시 작성


---

### 🔹 문제 10

다음 중 원격 저장소의 브랜치 목록을 확인하는 명령어는?

A. `git remote list`
B. `git branch -r`
C. `git log --remote`
D. `git show-remote`

---

## ✅ Git 이론 문제2 – `checkout`, `HEAD`, `reset`, 스테이징/커밋

## 📄 요약

| 주제       | 관련 명령                                  | 개념 키워드            |
| -------- | -------------------------------------- | ----------------- |
| checkout | `git checkout`, `HEAD`, `-b`, detached | 커밋 이동, 브랜치 이동     |
| HEAD     | `HEAD`, `HEAD~1`, `detached`           | 현재 위치 포인터         |
| reset    | `--soft`, `--mixed`, `--hard`          | 커밋/스테이징/작업트리 되돌리기 |
| 스테이징     | `git add`, `git reset <파일>`            | 커밋 준비             |
| 커밋       | `git commit`, `git log`                | 저장소 기록 남기기        |

---

---

### 🔹 문제 1

`git checkout <커밋 해시>` 명령어의 효과는?

A. 해당 커밋을 삭제한다
B. 해당 커밋을 현재 브랜치에 병합한다
C. 해당 커밋으로 이동하여 `detached HEAD` 상태가 된다
D. 해당 커밋을 새 브랜치로 만든다
---

### 🔹 문제 2

`HEAD`는 Git에서 무엇을 가리키는가?

A. 마지막 push된 커밋
B. 현재 브랜치의 리모트 커밋
C. 현재 checkout 되어 있는 커밋
D. 첫 번째 커밋


---

### 🔹 문제 3

`git checkout -b new-branch` 명령어는 무슨 동작을 하나?

A. 새로운 브랜치를 만들고 그 브랜치로 이동
B. 브랜치를 삭제
C. 브랜치를 main으로 병합
D. 브랜치 변경 없이 브랜치 이름을 바꿈


---

### 🔹 문제 4

`git reset --soft HEAD~1` 명령어의 효과는?

A. 마지막 커밋을 삭제하고 스테이징까지 되돌린다
B. 마지막 커밋만 되돌리고, 작업 내용은 그대로 스테이징됨
C. 커밋과 작업 내용 모두 삭제됨
D. 아무 일도 일어나지 않음


---

### 🔹 문제 5

`git reset --hard`를 사용할 때 주의할 점은?

A. 커밋 기록만 제거된다
B. 로컬 저장소가 원격으로 덮어씌워진다
C. 스테이징, 커밋, 작업 디렉토리가 모두 초기화된다
D. 브랜치가 자동으로 삭제된다


---

### 🔹 문제 6

스테이징 영역(index)에 파일을 추가하는 명령어는?

A. `git stage`
B. `git store`
C. `git commit`
D. `git add`

---

### 🔹 문제 7

다음 중 커밋을 생성하는 명령어는?

A. `git push`
B. `git stash`
C. `git commit`
D. `git merge`


---

### 🔹 문제 8

`git status` 명령어로 확인할 수 없는 정보는?

A. 현재 브랜치 이름
B. 변경된 파일 목록
C. 마지막 커밋 메시지
D. 스테이징 여부


---

### 🔹 문제 9

`git reset <파일>` 명령어의 용도는?

A. 파일을 커밋에서 삭제
B. 파일을 원래 버전으로 되돌림
C. 스테이징 영역에서 해당 파일 제거 (작업 디렉토리는 유지)
D. 파일을 완전히 삭제


---

### 🔹 문제 10

작업 트리에서는 변경되었지만 아직 스테이징하지 않은 파일의 상태는?

A. committed
B. staged
C. modified
D. tracked but unchanged


---


*/
}
